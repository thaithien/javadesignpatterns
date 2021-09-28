package com.github.thaithien.codewithmosh.iterator;

public class Main {
public static void main(String[] args) {
	BrowserHistory history = new BrowserHistory();
	history.push("a");
	history.push("b");
	history.push("c");
	
	history.pop();
	Iterator< String> iter = history.createIterator();
	while(iter.hasNext()) {
		String url = iter.current();
		System.out.println(url);
		iter.next();
	}
}
}
