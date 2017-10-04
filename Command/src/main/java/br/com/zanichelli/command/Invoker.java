package br.com.zanichelli.command;

import java.util.Stack;

public class Invoker {

	private ICommand on;
	private ICommand off;
	private Stack<ICommand> commands = new Stack<>();

	public Invoker(ICommand on, ICommand off) {
		this.on = on;
		this.off = off;
	}

	public void onButton() {
		on.execute();
		commands.push(on);
	}
	
	public void offButton() {
		off.execute();
		commands.push(off);
	}
	
	public void undo() {
		ICommand last = commands.pop();
		last.unexecute();
	}
	
}
