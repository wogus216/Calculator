import java.util.Scanner;

public class Calculator {
 public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("ù��° ���ڸ� �Է����ּ���");
	 int num1= sc.nextInt();
	 System.out.println(num1);
	
	 int result=num1;
	 while(true) {

		 System.out.println("��Ģ���� ��ȣ�� �Է����ּ��� :");
		 String symbol=sc.next();
		 System.out.println(symbol);
		 
		 if("quit".equals(symbol)) {
			 System.out.println("������� �� : "+result);
			 break;
		 }
		 
		 System.out.println("�ι�° ���ڸ� �Է����ּ���");
		 int num2= sc.nextInt();
		 System.out.println(num2);
		 
		 if(symbol.equals("+")) {
			 result=result+num2;
			 System.out.println("���� ��� : "+ result);
		 } else if(symbol.equals("-")) {
			 result=result-num2;
			 System.out.println("���� ��� : "+ result);
		 } else if(symbol.equals("*")) {
			 result=result*num2;
			 System.out.println("���� ��� : "+ result);
		 } else if(symbol.equals("/")){
			 result=result/num2;
			 System.out.println("������ ��� :"+result);
		 } else {
			 System.out.println("�߸��� ��ȣ�� �Է��ϼ̽��ϴ�.");
		 }
	 }
 	}
 }