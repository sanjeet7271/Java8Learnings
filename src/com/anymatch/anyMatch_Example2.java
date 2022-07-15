package com.anymatch;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class anyMatch_Example2 {
	public static void main(String[] args) {
		Stream<String> stream=Stream.of("Geeks", "fOr",
                "GEEKSQUIZ", "GeeksforGeeks");
		boolean answer=stream.anyMatch(str->Character.isUpperCase(str.charAt(0)));
		System.out.println(answer);
	}
}
