package com.corejava.iostreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {

	public static void readData(String path) {
		try {
			FileReader fin = new FileReader(path);
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
			FileWriter fout = new FileWriter(path);
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
