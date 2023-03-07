package com.yasinsolak;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
	
		try(FileReader reader =new FileReader("liste.txt") ){
			
			int okunan;
			while((okunan = reader.read()) != -1 ) {
				char okunanChar = (char) okunan;
				System.out.print(okunanChar);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
