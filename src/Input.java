import java.util.Scanner;

public class Input {
	static int getFirstValue(Scanner sc) {
		System.out.println("ù�� ° ���ڸ� �Է����ּ���");
		int first=sc.nextInt();
		System.out.println(first);
		return first;
	}
	
	static String getSymbol(Scanner sc) {
		System.out.println("��Ģ���� ��ȣ�� �Է����ּ���");
		String symbol=sc.next();
		System.out.println(symbol);
		return symbol;
	}
	
	static int getSecondValut(Scanner sc) {
		System.out.println("�ι� ° ���ڸ� �Է����ּ���");
		int second=sc.nextInt();
		System.out.println(second);
		return second;
	}
}
