import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("숫자 두개와 사칙연산기호 입력부탁드립니다.");
	
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	String symbol=sc.next();
	
	switch(symbol) {
	case "+":
		System.out.println(num1+num2);
		break;
	case "-":
		System.out.println(num1-num2);
		break;
	case "*":
		System.out.println(num1*num2);
		break;
	case "/":
		System.out.println(num1/num2);
		break;
	}
		sc.close();
	}
}
