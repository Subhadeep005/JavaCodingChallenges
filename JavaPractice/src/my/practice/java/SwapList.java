package my.practice.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SwapList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		
		final List l = list;
        l.set(0, l.set(2, l.get(0)));
        

		//Collections.swap(list, 0, 2);

		l.forEach(System.out::println);
	}
}
