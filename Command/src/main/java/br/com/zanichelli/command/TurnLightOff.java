package br.com.zanichelli.command;

public class TurnLightOff implements ICommand {

	private Light light;

	public TurnLightOff(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
		System.out.print("Off ");
	}

	@Override
	public void unexecute() {
		light.on();
		System.out.print("On ");
	}

}
