import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("���ڸ� �Է����ּ���");
		Scanner sc = new Scanner(System.in);
		String inputnumber=sc.nextLine();
		String[] splitvalue=inputnumber.split(",");
		int num1= Integer.parseInt(splitvalue[0]);
		int num2= Integer.parseInt(splitvalue[1]);
	System.out.println(num1 + num2);
	System.out.println(num1 - num2);
	System.out.println(num1 * num2);
	System.out.println(num1 / num2);
	}

}
