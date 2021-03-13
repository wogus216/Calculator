import java.util.Scanner;

public class Calculator {
 public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("첫번째 숫자를 입력해주세요");
	 int num1= sc.nextInt();
	 System.out.println(num1);
	
	 int result=num1;
	 while(true) {

		 System.out.println("사칙연산 기호를 입력해주세요 :");
		 String symbol=sc.next();
		 System.out.println(symbol);
		 
		 if("quit".equals(symbol)) {
			 System.out.println("최종결과 값 : "+result);
			 break;
		 }
		 
		 System.out.println("두번째 숫자를 입력해주세요");
		 int num2= sc.nextInt();
		 System.out.println(num2);
		 
		 if(symbol.equals("+")) {
			 result=result+num2;
			 System.out.println("덧셈 결과 : "+ result);
		 } else if(symbol.equals("-")) {
			 result=result-num2;
			 System.out.println("뺄셈 결과 : "+ result);
		 } else if(symbol.equals("*")) {
			 result=result*num2;
			 System.out.println("곱셈 결과 : "+ result);
		 } else if(symbol.equals("/")){
			 result=result/num2;
			 System.out.println("나눗셈 결과 :"+result);
		 } else {
			 System.out.println("잘못된 기호를 입력하셨습니다.");
		 }
	 }
 	}
 }