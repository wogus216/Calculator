import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("���� �ΰ��� ��Ģ�����ȣ �Էº�Ź�帳�ϴ�.");
	
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
