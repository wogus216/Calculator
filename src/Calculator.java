import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println(" �Է°�");
	String input=sc.nextLine();
	String[] splitValue=input.split(",");
	int num1= Integer.parseInt(splitValue[0]);
	System.out.println("�ι�° �Է°�");
	int num2= Integer.parseInt(splitValue[1]);
	
	System.out.println("���� :"+(num1+num2));
	System.out.println("���� :"+(num1-num2));
	System.out.println("���� :"+(num1*num2));
	System.out.println("������ :"+(num1/num2));
	sc.close();
	}
	
}
