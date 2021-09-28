package com.github.thaithien.codewithmosh.strategy;

public class ImageStore {
	public static void store(String fileName, Compressor compressor, Filter filter) {
		compressor.compress(fileName);
		filter.filter(fileName);
	}
}
