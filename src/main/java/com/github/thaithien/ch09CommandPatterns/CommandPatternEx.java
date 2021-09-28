package com.github.thaithien.ch09CommandPatterns;

public class CommandPatternEx {

	public static void main(String[] args) {
		System.out.println("Command pattern");
		Receiver intendedReceiver = new Receiver();
		Invoke inv = new Invoke();
		MyUndoCommand undoCmd = new MyUndoCommand(intendedReceiver);
		MyRedoCommand redoCmd = new MyRedoCommand(intendedReceiver);
		inv.executeCommand(redoCmd);
		inv.executeCommand(undoCmd);
	}

}
