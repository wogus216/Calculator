import java.util.Scanner;

public class Input {
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
}
