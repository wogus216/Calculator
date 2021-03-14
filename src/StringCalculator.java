import java.util.Scanner;

public class StringCalculator {
	
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("계산할 값을 입력해주세요");
	String InputValue=sc.nextLine();
	String[] InputValues=InputValue.split(" ");
	System.out.println("총 입력한 숫자 : "+InputValue);
	
	int first=Integer.parseInt(InputValues[0]);
	System.out.println("첫째 값 : "+first);
	
	int result=first;
	for(int i=1; i<InputValues.length; i+=2) {
		String symbol=InputValues[i];
		System.out.println("사칙연산 기호 : "+symbol);
		
		int second=Integer.parseInt(InputValues[i+1]);
				System.out.println("두번째 값 : "+second);
	
		result=Calculator.calculate(result, symbol, second);
	}
	 	Output.print(result);
	}	
}

