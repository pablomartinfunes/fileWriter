package com.pmf;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {

		File file = new File("nombres.txt");

		try {

			BufferedWriter bw = new BufferedWriter(new FileWriter(file));

			bw.write("Pablo\n");
			bw.write("Lucas\n");

			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
