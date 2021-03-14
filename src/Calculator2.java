import java.util.Scanner;
	
public class Calculator2 {
	
	static int getFirstValue(Scanner sc) {
		System.out.println("ù��° ���ڸ� �Է����ּ���");
		int first=sc.nextInt();
		System.out.println(first);
		return first;
	}
	
	static String getSymbolValue(Scanner sc) {
		System.out.println("��ȣ�� �Է����ּ���");
		String symbol=sc.next();
		System.out.println(symbol);
		return symbol;
		}
	
	static int getSecondValue(Scanner sc) {
		System.out.println("�ι� ° ���ڸ� �Է����ּ���");
		int second=sc.nextInt();
		System.out.println(second);
		return second;
	}
	
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
		} return result;
	}
	static void print(int result) {
		System.out.println("���� ��� :"+ result);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int first=getFirstValue(sc);
		
	
		int result=first;
		while(true) {
			
			String symbol=getSymbolValue(sc);

			if(symbol.equals("quit")){
				print(result);
				break;
			}
			
			int second=getSecondValue(sc);
			
			result=calculate(result, symbol, second);
			
		}
	
	}
}