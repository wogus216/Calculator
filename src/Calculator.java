import java.util.Scanner;

public class Calculator {
	
	
	static int calculate(int first, String symbol, int second) {
		int result=0;
		if(symbol.equals("+")) {
			result=first+second;
			System.out.println("������ ��� :"+result);
		} else if(symbol.equals("-")) {
			result=first-second;
			System.out.println("������ ��� : "+result);
		} else if(symbol.equals("*")) {
			result=first*second;
			System.out.println("������ ��� : "+result);
		} else if(symbol.equals("/")) {
			result=first/second;
			System.out.println("�������� ��� : "+result);
		} else {
			System.out.println("��Ģ���� ��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
		} 
		return result;
	}



}

