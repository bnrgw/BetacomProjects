package com.betacom.random;

import java.io.IOException;
import java.io.RandomAccessFile;

public class MainRandom {

	public static void main(String[] args) {
		
		try {
		String path = "/C:\\Users\\Betacom\\Desktop\\sourceTest.txt";
        System.out.println(new String(readCharsFRomFIle(path,1,4)));//legge dalla posizione 1 alla posizione 4
        
        writeData(path,"Data", 4);
        
        appendData(path,"appended data");
        
        writeData(path,"Academy", 7);
	}catch(IOException e) {
		System.out.println("error found :" + e.getMessage());
	}
	}
	
//QUESTI METODI SERVEON PER LA MANIPULAZIONE DEI DATI IN UN FILE E NON PER ANDARE SU RECCORDS	
	private static byte[] readCharsFRomFIle(String path, int seek, int chars) throws IOException{
		RandomAccessFile file = new RandomAccessFile(path, "r");
		file.seek(seek);
		byte[] bytes = new byte[chars];
		file.read(bytes);
		file.close();
		return bytes;
	}
	
	private static void writeData(String path, String data, int seek) throws IOException{
		RandomAccessFile file = new RandomAccessFile(path, "rw");
		file.seek(seek);//ti posiziona a l'indice dove vuoi
		file.write(data.getBytes());
		file.close();
	}
	
	
	private static void appendData(String path, String data)throws IOException{
		RandomAccessFile file = new RandomAccessFile(path, "rw");
		file.seek(file.length());//mi permette di scrivere alla fine del file
		System.out.println("current pointer:" + file.getFilePointer());
		file.write(data.getBytes());
		file.close();
	}
	
	

	
	
}
