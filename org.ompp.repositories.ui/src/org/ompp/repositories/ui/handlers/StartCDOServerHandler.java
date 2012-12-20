package org.ompp.repositories.ui.handlers;

import java.io.IOException;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.server.IStore;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
//import org.eclipse.emf.cdo.server.IStore;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.hsqldb.persist.HsqlProperties;
import org.hsqldb.server.Server;
import org.hsqldb.server.ServerAcl.AclFormatException;
import org.ompp.cdo.CDOClient;
import org.ompp.cdo.CDOServer;
import org.ompp.cdo.hsqldb.HSQLDBStoreFactory;
import org.ompp.organization.model.ModelFactory;
import org.ompp.organization.model.Organization;

public class StartCDOServerHandler {
	private HsqlProperties properties;

	@Execute

	public void run( Shell shell)
	{
		//		Server server= new Server();
		//		HsqlProperties properties = new HsqlProperties();
		//		properties.setProperty("server.database.0", "file:/Users/gcolburn/Documents/OMPP/Server/localdb");
		//		properties.setProperty("server.dbname.0", "localdb");
		//		properties.setProperty("server.remote_open", true);
		//		try {
		//			server.setProperties( properties );
		//		} catch (IOException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		} catch (AclFormatException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}
		//		server.start();
		//
		//
		//		IStore store = new HSQLDBStoreFactory().createStore(null, "localdb","localhost",null,"sa","");
		//		CDOServer cdoServer = new CDOServer("root", "/res1");
		//		CDONet4jSession session = cdoServer.getSession(store);

		CDOClient client = null;
		CDONet4jSession cs = null;
		CDOTransaction transaction = null;
		CDOResource res = null;
		Organization org = null;
		try {
			client = new CDOClient("localhost");
			cs = client.getSession("root");
			transaction = cs.openTransaction();
			res = transaction.getResource("/res1");

			//			try {
			//				res.getContents().add(org);
			//				res.save(null);
			//			} catch (IOException e) {
			//				// TODO Auto-generated catch block
			//				e.printStackTrace();
			//			}
			//			transaction.close();
			//			cs.close();

			if( res.getContents().size() == 0) {
				org = ModelFactory.eINSTANCE.createOrganization();
				org.setName("OHSU123");
				res.getContents().add( org );
				res.save(null);
			} else if ( res.getContents().get(0) instanceof Organization ) {
				org = (Organization)res.getContents().get(0);
				MessageDialog.openInformation( shell, "Just testing", org.getName());
			}
			cs.close();
		} catch (Exception e ) {
			e.printStackTrace();
		}

		//		session.close();
		//		server.stop();



	}

}
