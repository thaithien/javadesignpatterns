package com.github.thaithien.ch09CommandPatterns;

public class MyUndoCommand implements ICommand {
	private Receiver receiver;

	public MyUndoCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void Do() {
		receiver.performUndo();
	}

}
