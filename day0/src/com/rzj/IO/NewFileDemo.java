package com.rzj.IO;

import java.io.File;
import java.io.IOException;

public class NewFileDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("D:/wozaizhe");
		file.mkdirs();

	}
}
