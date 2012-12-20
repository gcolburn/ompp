package org.ompp.cdo.hsqldb.application;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.server.IStore;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.hsqldb.persist.HsqlProperties;
import org.hsqldb.server.Server;
import org.hsqldb.server.ServerAcl.AclFormatException;
import org.ompp.cdo.CDOClient;
import org.ompp.cdo.CDOServer;
import org.ompp.cdo.hsqldb.HSQLDBStoreFactory;

public class Application implements IApplication {

	protected Server server = null;
	protected CDOServer cdoServer = null;
	protected CDONet4jSession session = null;
	boolean success = true;
	
	@Override
	public Object start(IApplicationContext context) throws Exception {
		System.out.println("Starting OMPP Server");
		
		startHSQLServer();
		startCDOServer();
		
		if (success) {
			System.out.println("Server started...");
			System.out.println("Enter the command 'stop' to terminate the server.");
		} else {
			System.out.println("Server startup failed. Check error messages.");
		}
		
		Scanner in = new Scanner(System.in);
		String input = "";
		while (!input.matches("stop")) {
			input = in.nextLine();
		}
		
		in.close();
		
		stopServer();
		
		return null;
	}
	
	protected void startHSQLServer() {
		if ( server != null )
			return;
		server = new Server();
		
		HsqlProperties properties = new HsqlProperties();
		properties.setProperty("server.database.0", "file:/Users/gcolburn/Documents/OMPP/Server/localdb");
		properties.setProperty("server.dbname.0", "localdb");
		properties.setProperty("server.remote_open", true);
		
		try {
			server.setProperties( properties );
			server.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			success = false;
		} catch (AclFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			success = false;
		}
	}
	
	protected void startCDOServer() {
		if ( cdoServer != null || session != null )
			return;
		
		IStore store = new HSQLDBStoreFactory().createStore(null, "localdb","localhost",null,"sa","");
		cdoServer = new CDOServer("root", "/res1");
		try {
			session = cdoServer.getSession(store);
		} catch (Exception e ) {
			e.printStackTrace();
			success = false;
		}
	}

	protected void stopServer() {
		session.close();
		server.stop();
		
		System.out.println("Server stopped...");
	}
	
	@Override
	public void stop() {
		stopServer();
	}

}
