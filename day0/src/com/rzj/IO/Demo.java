package com.rzj.IO;

import java.io.File;

public class Demo {
	public static void main(String[] args) {
		File file = new File("D:/wozaizhe");
		list(file);
	}

	public static void list(File file) {
		if (file.isDirectory())// �ж�file�Ƿ���Ŀ¼
		{
			File[] lists = file.listFiles();
			if (lists != null) {
				for (int i = 0; i < lists.length; i++) {
					list(lists[i]);// ��Ŀ¼�͵ݹ����Ŀ¼���ٽ����ж�
				}
			}
		}
		System.out.println(file);// file����Ŀ¼�����������·���������ǵݹ�ĳ���
	}

}
