package com.anymatch;

import java.util.Arrays;
import java.util.List;

public class anyMatch_Example1 {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(4,3,7,6,5,8);
		boolean answer=list.stream().anyMatch(n->n*(n+1)/4==5);
		System.out.println(answer);
	}
}
