import java.util.Scanner;

public class Calculator {
	static int getFirstValue(Scanner sc) {
		System.out.println("첫번 째 숫자를 입력해주세요");
		int first=sc.nextInt();
		System.out.println(first);
		return first;
	}
	
	static String getSymbol(Scanner sc) {
		System.out.println("사칙연산 기호를 입력해주세요");
		String symbol=sc.next();
		System.out.println(symbol);
		return symbol;
	}
	
	static int getSecondValut(Scanner sc) {
		System.out.println("두번 째 숫자를 입력해주세요");
		int second=sc.nextInt();
		System.out.println(second);
		return second;
	}
	
	static int calculate(int first, String symbol, int second) {
		int result=0;
		if(symbol.equals("+")) {
			result=first+second;
			System.out.println("덧셈의 결과 :"+result);
		} else if(symbol.equals("-")) {
			result=first-second;
			System.out.println("뺄셈의 결과 : "+result);
		} else if(symbol.equals("*")) {
			result=first*second;
			System.out.println("곱셈의 결과 : "+result);
		} else if(symbol.equals("/")) {
			result=first/second;
			System.out.println("나눗셈의 결과 : "+result);
		} else {
			System.out.println("사칙연산 기호를 잘못 입력하셨습니다.");
		} 
		return result;
	}
	static void print(int result) {
		System.out.println("최종 결과 값 : "+result);
	}


public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int first=getFirstValue(sc);

	int result=first;
	while(true) {
		String symbol=getSymbol(sc);
		
	if(symbol.equals("quit")) {
		print(result);
		break;
	}
	
	int second=getSecondValut(sc);
	
	result=calculate(result, symbol, second);
	
	
		}
	}
}

