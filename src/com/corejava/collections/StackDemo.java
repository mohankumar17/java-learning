package com.corejava.collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();

		st.push(4);
		st.push(1);
		st.push(3);
		st.push(2);
		st.push(6);
		st.push(5);

		for (int ele : st) {
			System.out.print(ele + " ");
		}
		System.out.println();

		System.out.println(st.peek());
		
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);

	}

}
