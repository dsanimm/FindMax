package com.capgemini;
import java.util.Arrays;

public class MaxFinder <E extends Comparable> {
	E[] arr;
	
	MaxFinder(E[] arr){
		this.arr = arr;
	}
	public MaxFinder() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {

	}

	
	public <E extends Comparable> E findMax(MaxFinder maxfinder) {
		 Arrays.sort(maxfinder.arr);
		return (E) maxfinder.arr[maxfinder.arr.length-1];
	}
	public static <E extends Comparable> void  printMax(E max){
		System.out.println("Maximum value is "+ max);
	}

}
