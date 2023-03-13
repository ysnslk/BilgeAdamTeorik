package question4;

import java.util.Random;

public class Util {
	
	public static int rasgeleSayi() {
		
		Random rnd = new Random();
		
		int rndSayi = rnd.nextInt(1,101);
		return rndSayi;
	}

}
