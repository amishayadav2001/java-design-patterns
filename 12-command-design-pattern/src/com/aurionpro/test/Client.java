package com.aurionpro.test;

import com.aurionpro.model.Command;
import com.aurionpro.model.Light;
import com.aurionpro.model.LightOnCommand;
import com.aurionpro.model.RemoteControl;

public class Client {

	public static void main(String[] args) {
		Light light = new Light();
		Command lightOn = new LightOnCommand(light);

		RemoteControl remote = new RemoteControl(lightOn);
		remote.setCommand(lightOn);

		remote.pressButton();

	}

}
