package com.jay.springcore.version1;

public class Client {
	MessageService messageService;
	
	Client(MessageService messageService){
		this.messageService = messageService;
	}
	
	public void run() {
		System.out.println("client using message service: "+messageService);
	}

}
