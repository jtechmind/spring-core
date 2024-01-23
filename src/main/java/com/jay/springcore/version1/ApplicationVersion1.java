package com.jay.springcore.version1;

public class ApplicationVersion1 {

	public static void main(String[] args) {
		// version first of the application
		// uses classes and objects, without spring container
		var messageservice = new MessageService();
		var client = new Client(messageservice);
		client.run();
		

	}

}
