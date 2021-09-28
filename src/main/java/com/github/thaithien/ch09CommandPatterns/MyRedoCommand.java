package com.github.thaithien.ch09CommandPatterns;

public class MyRedoCommand implements ICommand {

	private Receiver receiver;
	
	public MyRedoCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	public void Do() {
		receiver.performRedo();
	}

}
