/**
 * 
 */
package org.naresh.javariders;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import com.couchbase.client.CouchbaseClient;

/**
 * @author Naresh
 *
 */
public class CouhbaseMain {

	/**
	 * @param args
	 * @throws URISyntaxException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws URISyntaxException, IOException {
		// TODO Auto-generated method stub

		List<URI> servers = new ArrayList<URI>();
		servers.add(new URI("http://127.0.0.1:8091/pools"));
		servers.add(new URI("http://127.0.0.1:8091/pools"));

		// Create a client talking to the default bucket

		CouchbaseClient cbc = new CouchbaseClient(servers, "default", "javariders");

		// Create a client talking to the default bucket

		//CouchbaseClient cbc = new CouchbaseClient(servers, "default", "");

		System.out.println("Hello "+cbc.get("thisname"));
		
		cbc.shutdown();
	
	}

}
