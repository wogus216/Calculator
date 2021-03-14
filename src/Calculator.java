import java.util.Scanner;

public class Calculator {
	
	
	static int calculate(int first, String symbol, int second) {
		int result=0;
		if(symbol.equals("+")) {
			result=first+second;
			System.out.println("µ¡¼ÀÀÇ °á°ú :"+result);
		} else if(symbol.equals("-")) {
			result=first-second;
			System.out.println("»¬¼ÀÀÇ °á°ú : "+result);
		} else if(symbol.equals("*")) {
			result=first*second;
			System.out.println("°ö¼ÀÀÇ °á°ú : "+result);
		} else if(symbol.equals("/")) {
			result=first/second;
			System.out.println("³ª´°¼ÀÀÇ °á°ú : "+result);
		} else {
			System.out.println("»çÄ¢¿¬»ê ±âÈ£¸¦ Àß¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù.");
		} 
		return result;
	}



}

