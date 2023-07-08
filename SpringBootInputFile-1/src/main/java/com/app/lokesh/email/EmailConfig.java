
package com.app.lokesh.email;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ConfigurationProperties loads all keys into matching variables
   at a time by writing this only one time per class
   with the help of prefix.
 */
@ConfigurationProperties(prefix = "com.app")
@Component
public class EmailConfig {

	private Integer port;
	private String host;
	private String sender;
	private String receiver;

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	@Override
	public String toString() {
		return "EmailConfig [port=" + port + ", host=" + host + ", sender=" + sender + ", receiver=" + receiver + "]";
	}

}
