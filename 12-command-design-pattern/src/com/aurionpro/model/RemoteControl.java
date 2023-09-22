package com.aurionpro.model;

public class RemoteControl {
	private Command command;

	public RemoteControl(Command command) {
		super();
		this.command = command;
	}

	public void pressButton() {
		command.execute();
	}

	public void setCommand(Command lightOn) {
		
	}

}
