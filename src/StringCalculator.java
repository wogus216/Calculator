import java.util.Scanner;

public class StringCalculator {
	
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("����� ���� �Է����ּ���");
	String InputValue=sc.nextLine();
	String[] InputValues=InputValue.split(" ");
	System.out.println("�� �Է��� ���� : "+InputValue);
	
	int first=Integer.parseInt(InputValues[0]);
	System.out.println("ù° �� : "+first);
	
	int result=first;
	for(int i=1; i<InputValues.length; i+=2) {
		String symbol=InputValues[i];
		System.out.println("��Ģ���� ��ȣ : "+symbol);
		
		int second=Integer.parseInt(InputValues[i+1]);
				System.out.println("�ι�° �� : "+second);
	
		result=Calculator.calculate(result, symbol, second);
	}
	 	Output.print(result);
	}	
}

