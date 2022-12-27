package com.corejava.iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Employee emp = new Employee(1, "Paul");

		String path = "C:\\AAA\\Work\\Infometry\\MuleSoft\\Utils\\Dummy\\Serial.txt";

		FileOutputStream fout = new FileOutputStream(path);
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(emp); // POJO to Byte-Stream
		out.flush();
		out.close();

		/********************/

		FileInputStream fin = new FileInputStream(path);
		ObjectInputStream in = new ObjectInputStream(fin);

		Employee empR = (Employee) in.readObject(); // Byte-Stream to POJO
		System.out.println("ID: " + empR.getId() + ", Name: " + empR.getName());
		in.close();

	}

}
