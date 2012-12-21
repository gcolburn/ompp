package org.ompp.cdo;

import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.util.container.FactoryNotFoundException;
import org.eclipse.net4j.util.container.IPluginContainer;

public class CDOClient {
	protected IConnector connector = null;
	
	public CDOClient( String cdoServer ) {
		try {
			// Connect to Repository
			//connector = (IConnector)IPluginContainer.INSTANCE.getElement("org.eclipse.net4j.connectors","tcp",cdoServer);
			connector = Net4jUtil.getConnector(IPluginContainer.INSTANCE, "tcp://localhost:2036");
		} catch (Exception e ) {
			System.out.println( "Unable to connect to server!\n" + e.getMessage() );
			e.printStackTrace();
		}
	}
	
	public CDONet4jSession getSession(String repositoryName )  throws FactoryNotFoundException {
		CDONet4jSessionConfiguration c = CDONet4jUtil.createNet4jSessionConfiguration();
		c.setConnector(connector);
		c.setRepositoryName( repositoryName );
		c.setActivateOnOpen(true);
		
		CDONet4jSession s = c.openNet4jSession();
		return s;
	}
}
