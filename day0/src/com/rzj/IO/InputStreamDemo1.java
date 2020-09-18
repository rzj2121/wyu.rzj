package com.rzj.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamDemo1 {
	public static void main(String[] args) throws IOException {
		File file = new File("D:/wozaizhe/123.txt");
		OutputStream os = new FileOutputStream(file);
		String string = "hahaha";
		byte[] b1 = string.getBytes();
		os.write(b1);
		os.close();
		System.out.println(file.exists());
		InputStream is = new FileInputStream(file);
		byte[] b = new byte[1024];
		is.read(b);
		is.close();
		System.out.println(new String(b));

	}
}
