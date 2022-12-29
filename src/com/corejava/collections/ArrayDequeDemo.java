package com.corejava.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		Deque<Integer> dqy = new ArrayDeque<>();

		dqy.addFirst(4);
		dqy.addFirst(1);
		dqy.addFirst(3);
		dqy.addLast(2);
		dqy.addLast(6);
		dqy.addLast(5);
		// 3,1,4,2,6,5

		for (int ele : dqy) {
			System.out.print(ele + " ");
		}
		System.out.println();
		
		System.out.println(dqy.peekFirst());
		System.out.println(dqy.peekLast());
		
		System.out.println(dqy.removeFirst());
		System.out.println(dqy);
		System.out.println(dqy.removeLast());
		System.out.println(dqy);
		System.out.println(dqy.remove()); //removes first element by default
		System.out.println(dqy);

	}

}
