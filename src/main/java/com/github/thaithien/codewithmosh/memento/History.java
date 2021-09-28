package com.github.thaithien.codewithmosh.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
	private List<EditorState> states = new ArrayList<>();
	
	public void push(EditorState state) {
		states.add(state);
	}
	public EditorState pop() {
		int lastIndex = states.size() -1;
		EditorState lastState = states.get(lastIndex);
		states.remove(lastIndex);
		return lastState;
	}
	
	@Override
	public String toString() {
		return "History [states=" + states + "]";
	}
	
}
