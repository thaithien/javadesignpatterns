package com.github.thaithien.ch09CommandPatterns;

public class Invoke {
	ICommand cmd;
	
	public void executeCommand(ICommand cmd) {
		this.cmd = cmd;
		cmd.Do();
	}
}
