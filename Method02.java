package Method;

public class Method02 {

public static void main(String[] args) {
		
		int num = 10;
		
		num = 20;
		
		System.out.println(num);
		
		
		//제어 흐름
		//- 프로그램 코드의 실행 순서
		//- 책 읽듯이 위에서부터 아래로 한줄씩 실행
		System.out.println("하나");
		m1(); // = (public static void m1() { }라인으로 이동하시오 = 제어가 이동한다.
		System.out.println("둘"); 
		m2(); // = 63라인으로 이동하시오 = 제어가 이동한다.
		System.out.println("셋");

		
		//이클립스 팁
		//- Ctrl + 1
		//- Context Menu > Refactor > Extract Method
		
		
		//메소드 호출 구문을 가지고 메소드 선언하기
		m3();
		
		//구현된 코드를 별도의 메소드로 추출하기
		m4();  // 코드 적고 블럭 설정뒤 마우스 오른쪽-> 리팩터-> 엑스트렉 메소드
		
		//원하는 메소드의 정의를 찾는 방법
		//1. Outline 보조창 사용
		//2. 호출 구문에서 F3 누르기(클래스, 변수, 메소드 등 모든 선언구문 이용 가능)
		
		//식별자를 수정하는 방법
		//- 클래스명, 메소드명, 변수명, 파일명(F2)
		//- 식별자를 정의한 곳에서 Ctrl+1 > Rename > 수정 > 완료(엔터)
		
		System.out.println(num);
		
		
	}//main

	private static void m4() {
		System.out.println("병아리");
	}

	private static void m3() {
		System.out.println("물고기");
		
	}

	public static void m1() {
		System.out.println("고양이");
	} //m1 실행 종료. 메소드는 실행이 종료되면 반드시 자기를 호출했던 곳으로 제어가 돌아간다.

	public static void m2() {
		
		System.out.println("강아지");
	}

}

