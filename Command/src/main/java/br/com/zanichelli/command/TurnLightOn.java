package br.com.zanichelli.command;

public class TurnLightOn implements ICommand {

	private Light light;

	public TurnLightOn(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
		System.out.print("On ");
	}

	@Override
	public void unexecute() {
		light.off();
		System.out.print("Off ");
	}

}
