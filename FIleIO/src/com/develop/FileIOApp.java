package com.develop;

import java.io.*;

import static java.lang.System.out;

public class FileIOApp {

	public static void main(String[] args) throws Exception {
		
		
		try (DataInputStream is = new DataInputStream(new FileInputStream("test.txt")))
		{
			out.println(is.readDouble());
			out.println(is.readInt());
			out.println(is.readUTF());
			
		} catch (IOException e) {
			
		}
		
//		FileOutputStream raw = new FileOutputStream("test.txt");
//		
//		DataOutputStream os = new DataOutputStream(raw);
//		
//		os.writeDouble(3.1415);
//		os.writeInt(42);
//		os.writeUTF("Hello there");
//		
//		os.flush();
//		
		
//		File dir = new File(".");
//		String[] listing = dir.list();
//		
//		for (String s : listing) {
//			out.println(s);
//		}
//		File f = new File(dir, "test2.txt");
//		RandomAccessFile raf = new RandomAccessFile(f, "rw");
//		
//		raf.writeChars("hello");
	}

}
