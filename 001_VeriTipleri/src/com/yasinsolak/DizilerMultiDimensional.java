package com.yasinsolak;

public class DizilerMultiDimensional {

	public static void main(String[] args) {
		
		
		int[] tekBoyutluDizi = new int[4]; //{0,0,0,0}
		
		
		//Çok boyutlu dizi(matris)
		
		int[][] cokBoyutluDizi = new int[2][3]; //Satır Sütün
												//{ {0,0,0} {0,0,0}
		//0 0 0
		//0 0 0
		
		cokBoyutluDizi[0][0] = 1;
		//1 0 0
		//0 0 0
		
		cokBoyutluDizi[1][2] = 8;
		//1 0 0
		//0 0 8
		
		System.out.println(cokBoyutluDizi[0][0]);
		System.out.println(cokBoyutluDizi[1][2]);
	}

}