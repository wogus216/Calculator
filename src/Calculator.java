import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println(" ÀÔ·Â°ª");
	String input=sc.nextLine();
	String[] splitValue=input.split(",");
	int num1= Integer.parseInt(splitValue[0]);
	System.out.println("µÎ¹øÂ° ÀÔ·Â°ª");
	int num2= Integer.parseInt(splitValue[1]);
	
	System.out.println("µ¡¼À :"+(num1+num2));
	System.out.println("»¬¼À :"+(num1-num2));
	System.out.println("°ö¼À :"+(num1*num2));
	System.out.println("³ª´°¼À :"+(num1/num2));
	sc.close();
	}
	
}
