package com.corejava.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamDemo {

	public static void readData(String path) {
		try {
			FileInputStream fin = new FileInputStream(path);
			int ch = fin.read();
			while (ch != -1) {
				System.out.print((char) ch);
				ch = fin.read();
			}
			fin.close();
			System.out.println();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeData(String path, String data) {
		try {
			FileOutputStream fout = new FileOutputStream(path);
			for (int i = 0; i < data.length(); i++) {
				char ch = data.charAt(i);
				fout.write((int) ch);
			}
			fout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		String path = "C:\\AAA\\Work\\Infometry\\MuleSoft\\Utils\\Dummy\\Sample.txt";
		System.out.println("Reading-------");
		readData(path);

		System.out.println("Writing-------");
		String data = "Jake Mortin";
		writeData(path, data);

		System.out.println("Reading-------");
		readData(path);
	}

}
