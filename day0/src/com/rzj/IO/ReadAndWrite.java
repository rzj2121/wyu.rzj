package com.rzj.IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReadAndWrite {
	public static void main(String[] args) throws IOException {
		File file = new File("D:/wozaizhe/123.txt");
		// д����
		Writer w = new FileWriter(file, true);
		String str = "123fwjhefiywgfei7wfw";
		w.write(str);
		w.close();
		// ������
		Reader r = new FileReader(file);
		char[] c = new char[1024];
		r.read(c);
		System.out.println(c);
	}
}
