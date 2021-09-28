package com.github.thaithien.codewithmosh.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
	List<String> urls = new ArrayList<>();
	
	public void push(String url) {
		urls.add(url);
	}
	public String pop() {
		int lastIndex = urls.size() -1 ;
		String lastItem = urls.get(lastIndex);
		
		urls.remove(lastItem);
		return lastItem;
	}
	
	Iterator createIterator() {
		return new ListIterator(this);
	}
	
	public class ListIterator  implements Iterator<String>{
		private BrowserHistory browserHistory;
		private int index;
		
		public ListIterator(BrowserHistory browserHistory) {
			this.browserHistory = browserHistory;
		}

		@Override
		public boolean hasNext() {
			return index < browserHistory.urls.size();
		}

		@Override
		public void next() {
			index++;
		}

		@Override
		public String current() {
			return browserHistory.urls.get(index);
		}
		
	}
}
