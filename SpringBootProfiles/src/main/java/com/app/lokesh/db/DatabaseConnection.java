/**
 * Environment : A complete setup to run application.(DB,server,config, dep)
                 Example: Development, QA, UAT(Client test), Production, PordSup..etc
                 
   Profiles :  If we move our application from one Env. to another Env,
			   code remains same (at max), changes comes at input file
			   (properties/yaml).     
   => In that case use one properties/yaml file for one environment.
   => File name must be :
		application-{profilename}.properties
		application-{profilename}.yml

   => Loading input file based on profilename is taken care by
      spring container.		
      
       Examples:
			application.properties    (default profile)
			application-qa.properties  (qa profile)
			application-prod.properties  (prod profile)

 */
package com.app.lokesh.db;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "com.app")
public class DatabaseConnection {
	private String driver;
	private String url;
	private String username;
	private String password;
}
