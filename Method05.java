package Method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Method05 {
	
	public static void main(String[] args) throws IOException{
		
		//[Method]
		
		/*
		 -void m1() : Method Signature, 메소드 서명(Sign)
		 
		  public static void m1() {
		  
		  }
		 
		 
		 메소드 반환값
		 - 메소드가 자신의 행동을 마친 뒤 호출한 곳으로 돌아온다 + 그냥 돌아오는게 아니라 값을 가지고 돌아온다 ==> (메소드)반환값 
		 - 행동의 결과를 반환한다 > 호출한 메소드의 결과를 이어서 업무를 진행한다.
		 
		 */

		//m1();
//		m1(10);		//양수		> 양수
//		m1(5);		//양수		> OK
//		m1(-10);	//양수아님	> 양수아님 
//		m1(-20);	//양수아님	> Fail
		
		System.out.println(m1(10));	
		System.out.println(m1(5));	
		System.out.println(m1(-10));	
		System.out.println(m1(-20));	
		
		String result1 = m1(10) ? "양수":"양수아님";
		System.out.println(result1);
		
		String result2 = m1(5) ? "OK":"Failed";
		System.out.println(result2);
		
		String result3 = m1(-10) ? "양수":"양수아님";
		System.out.println(result3);
		
		String result4 = m1(-20) ? "양수":"Fail";
		System.out.println(result4);
		
		//*** 메소드 반환값의 역할
		// > 메소드의 일처리후 일의 결과를 되돌려줘서 그 값을 사용해서 계속 업무를 진행 할 일이 있을 때 사용
			
		
		//메소드 : 시키는 일만 그대로 행동
		//메소드 + 매개변수 : 시키는 일을 하되 사용할 데이터를 변화. 주고
		//메소드 + 반환값 : 시키는 일을 하되 일의 결과를 돌려준다. 받기
		//메소드 + 매개변수 + 반환값 
		
		int a = 10;
		int b = 20;
		int sum = 0;
		
		sum = m2(a, b);
		
		System.out.println(sum);
		
		System.out.println(m2(5, 3));
		System.out.println(m2(1000, 20000));
		
		
		System.out.println();
		
		
		
		//요구사항] 이름, 나이, 주소 -> 입력 -> 화면 결과 출력
		
		//**** 반복되는 업무가 있으면 무조건 메소드로 추출한다.******
		
		String name = m3("이름 입력");
		String age = m3("나이 입력");
		String address = m3("주소 입력");
		
		System.out.println("==================");
		System.out.println("      입력 결과");
		System.out.println("==================");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("주소: " + address);
		
		
	}//main
	
	
	//void = 돌려주는 값이 없습니다(無). - null 대신 사용
	//boolean : 돌려주는 값이 boolean입니다.
	public static boolean m1(int n) {
		
		//어떤 숫자
		//int n = 10;
		
		n = n + 10;
		n *= 2;
		n -= 3;
		
		//String result = n > 0 ? "양수": "양수 아님";
		
		//System.out.println(result);
	
		boolean result = n > 0 ? true : false;
		
		// 리턴문, 반환문
		//- 해당 메소드를 종료하고, 값을 돌려주세요.
		//- 매개변수의 반대 개념
		return result; 
	
	
	}//m1
	
	
	//정수의 합을 구하는 메소드
	public static int m2(int a, int b) {
		
		return a + b;
	}
	
	public static String m3(String msg) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(msg + ": ");//Lable
		
		String input = reader.readLine();
		
		return input;
	}

}
