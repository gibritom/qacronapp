package michel.rest;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;


/**
 * Realiza disponibiliza os pacotes rest.
 * @generated
 */

@ApplicationPath("/api/rest/michel")
public class RESTApplication extends ResourceConfig {

    /**
     * @generated
     */
	public RESTApplication() {
		packages("michel.rest");
	}

}