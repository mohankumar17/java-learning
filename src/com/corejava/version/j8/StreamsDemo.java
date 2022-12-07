package com.corejava.version.j8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Item {
	int id;
	float price;
	int quanity;

	public Item(int id, float price, int quantity) {
		this.id = id;
		this.price = price;
		this.quanity = quantity;
	}
}

public class StreamsDemo {

	public static void main(String[] args) {
		List<Item> itemList = new ArrayList<Item>();
		itemList.add(new Item(1, 250.0f, 3));
		itemList.add(new Item(2, 160.0f, 2));
		itemList.add(new Item(3, 220.2f, 6));
		itemList.add(new Item(4, 590.0f, 1));
		itemList.add(new Item(5, 440.0f, 4));

		List<Float> itemPriceList = itemList.stream().map(i -> i.price).collect(Collectors.toList());
		System.out.println(itemPriceList);

		List<Float> itemPriceFilteredList = itemList.stream().filter(i -> i.price > 300).map(i -> i.price)
				.collect(Collectors.toList());
		System.out.println(itemPriceFilteredList);

		int totItems = itemList.stream().map(i -> i.quanity).reduce(0, (a, b) -> a + b);
		System.out.println(totItems);

		float totCost = itemList.stream().map(i -> i.quanity * i.price).reduce(0f, (a, b) -> a + b);
		System.out.println(totCost);
	}

}
