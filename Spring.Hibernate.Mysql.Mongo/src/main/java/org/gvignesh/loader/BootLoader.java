/**
 * 
 */
package org.gvignesh.loader;

import org.apache.log4j.Logger;
import org.gvignesh.init.Initiate;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Vignesh Gopal
 *
 */
public class BootLoader {
	
    private static final Logger log = Logger.getLogger(BootLoader.class);

    private static BootLoader instance = null;

    private static ConfigurableApplicationContext context = null;

    static {
        instance = new BootLoader();
        /// Enable MongoDB logging in general
        System.setProperty("DEBUG.MONGO", "true");

        // Enable DB operation tracing
        System.setProperty("DB.TRACE", "true");
    }

    private static BootLoader getInstance() {
        return instance;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        log.debug("Bootloader Initiating . . . ");
        ApplicationContextLoader loader = new ApplicationContextLoader();
        String configlocations[] = {"applicationContext-init.xml","applicationContext-dao.xml","applicationContext-mongo.xml"};
        loader.loadApplicationContext(configlocations);
        context = loader.getApplicationContext();
        getInstance().run(args);
	}
	
	private void run(String[] args) {
		Initiate initiate = (Initiate) context.getBean("initiate");
		initiate.initiate();
	}
}