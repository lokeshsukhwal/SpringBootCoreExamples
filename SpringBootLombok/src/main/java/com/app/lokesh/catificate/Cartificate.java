package com.app.lokesh.catificate;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * 
Project Lombok: 
=> It is Open Source , Source Code Generator API.
=> Setters, Getters, toString, equals, constructor..etc
=> Lombok Generates one intermediate source code file
   once it is compiled , Lombok is not required (to run)
=> Lombok is used while developing application.
 *  1. @Setter : generates set methods
	2. @Getter : generates get methods
	3. @ToString : override toString logic 
	4. @EqualsAndHashCode: generates equals and hashCode methods
	5. @NoArgsConstructor : Default/zero param constructor
	6. @AllArgsConstructor: All variables selected to create one
		parameterized constructor.
	7. @RequiredArgsConstructor + @NonNull : To generate selected
	   parameters constructor.
	8. @Data : This one is used to generate set/get, toString,
       equals, hashCode and Required Args Constructor.
 */
@Component
@ConfigurationProperties(prefix = "com.app")
@Data
public class Cartificate {
	private Integer cartificateId;
	private String provider;
	private String dateOfIssue;
}
