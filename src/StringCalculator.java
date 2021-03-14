import java.util.Scanner;

public class StringCalculator {

	public static void main(String[] args) {
	System.out.println("계산을 입력해주세요");
	Scanner sc= new Scanner(System.in);
	String inputValue=sc.nextLine();
	String[] inputValues=inputValue.split(" ");
	System.out.println(inputValue);
	
	int first=Integer.parseInt(inputValues[0]);
	System.out.println(first);

	int result=first;
	int i=1;
	while(i<inputValues.length) {
	String symbol=inputValues[i];
	System.out.println(symbol);
	

	int second=Integer.parseInt(inputValues[i+1]);
	System.out.println(second);

	i += 2;
	result=Calculator2.calculate(result, symbol, second);
		}
	Output.print(result);
	}	
}

