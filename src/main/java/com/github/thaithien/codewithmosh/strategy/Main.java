package com.github.thaithien.codewithmosh.strategy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageStore.store("testn.png", new JPEGCompressor(), new BWFilter());
		
		ImageStore.store("testn.png", new PNGCompresssor(), new RGBFilter());
	}

}
