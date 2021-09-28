package com.github.thaithien.codewithmosh.memento;

public class Demo {
	public static void main(String[] args) {
		Editor editor = new Editor();
		History history  = new History();
		editor.setContent("A");
		history.push(editor.createState());
		
		editor.setContent("B");
		history.push(editor.createState());
		
		
		editor.setContent("C");
 		
		System.out.println(editor);

		editor.restoreState(history.pop());
		
		System.out.println(editor);
		
		editor.restoreState(history.pop());
		
		System.out.println(editor);
		
	}
}
