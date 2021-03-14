import java.util.Scanner;

public class CalculatorMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int first=Input.getFirstValue(sc);

		int result=first;
		while(true) {
			String symbol=Input.getSymbol(sc);
			
		if(symbol.equals("quit")) {
			Output.print(result);
			break;
		}
		
		int second=Input.getSecondValut(sc);
		
		result=Calculator.calculate(result, symbol, second);
		
		
			}
		}
}
