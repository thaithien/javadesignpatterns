package com.github.thaithien.codewithmosh.iterator;

public interface Iterator<T> {
	boolean hasNext();
	void next();
	T current();
}
