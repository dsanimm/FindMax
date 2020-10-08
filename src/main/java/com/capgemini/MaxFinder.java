package com.capgemini;

public class MaxFinder <E extends Comparable>{
	E value1;
	E value2;
	E value3;
	MaxFinder(E value1,E value2,E value3){
		this.value1=value1;
		this.value2=value2;
		this.value3=value3;
	}
	public MaxFinder() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {

	}

	
	public <E extends Comparable> E findMax(MaxFinder maxfinder){
		E max = (E) maxfinder.value1;
		if ( maxfinder.value2.compareTo(max) > 0)
			max = (E) maxfinder.value2;
		if ( maxfinder.value3.compareTo(max) > 0)
			max = (E) maxfinder.value3;
		return max;
	}
	
}
