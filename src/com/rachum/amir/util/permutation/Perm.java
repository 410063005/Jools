package com.rachum.amir.util.permutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * http://www.cnblogs.com/nokiaguy/archive/2008/05/11/1191914.html
 */
public class Perm {

	public static void perm(List<Integer> list, int k, int m) {
		if (k >= m) {
			for (int i = 0; i < m; i++) {
				System.out.print(list.get(i));
			}
			System.out.println();
		} else {
			for (int i = k; i < m; i++) {
				Collections.swap(list, i, k);
				perm(list, k + 1, m);
				Collections.swap(list, i, k);
			}
		}
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3);
		perm(list, 0, 3);
		System.out.println("main");
		
		list = new ArrayList<Integer>();
		list.add(1); list.add(2); list.add(3);
		list.subList(0, 1).clear();
		System.out.println(list);
	}
}
