package org.arpit.javapostsforlearning.webservice;

import javax.xml.ws.Endpoint;

public class HelloWorldWSPublisher {

	public static void main(String[] args) {
		//http://localhost:8080/WS/HelloWorld?wsdl
		Endpoint.publish("http://localhost:8080/WS/HelloWorld",
				new HelloWorldImpl());

	}
}
