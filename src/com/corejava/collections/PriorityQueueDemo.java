package com.corejava.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<Integer> qy = new PriorityQueue<>(); // MinHeap by default
		// Multiply each item with -1 for MaxHeap

		qy.add(4);
		qy.add(1);
		qy.add(3);
		qy.add(2);
		qy.add(6);
		qy.add(5);

		for (int ele : qy) {
			System.out.print(ele + " ");
		}
		System.out.println();

		System.out.println(qy.peek());

		while (!qy.isEmpty()) {
			System.out.print(qy.remove() + " ");
		}

		System.out.println();
	}

}
