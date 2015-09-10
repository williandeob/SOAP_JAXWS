package org.arpit.javapostsforlearning.webservice.client;

import org.arpit.javapostsforlearning.webservice.HelloWorld;
import org.arpit.javapostsforlearning.webservice.HelloWorldImplService;

public class JAWSCliente {

	public static void main(String[] args) {
		 HelloWorldImplService helloWorldService = new HelloWorldImplService();  
	     HelloWorld helloWorld = helloWorldService.getHelloWorldImplPort();  
	     System.out.println(helloWorld.sayHelloWorld("Willian Batista"));  

	}

}
