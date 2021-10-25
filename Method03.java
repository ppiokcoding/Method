package Method;

public class Method03 {
	
	public static void main(String[] args) {
		
		/*
		  
		 public static void m1() { }
		 
		 1. m1
		 - 메소드명
		 
		 2. ()
		 - 인자 리스트
		 
		 3. void
		 - 반환 자료형
		 
		 
		 메소드의 인자 리스트
		 = 파라미터(Parameter)
		 = 인자(Arguments)
		 = 매개변수
		 = 가인자(Pseudo Arguments)
		 - (소극적인)다형성 구현
		 
		 */

		//요구사항] '홍길동'에게 인사를 하는 메소드를 만드시오.
		
		hello();
		
		//수정사항] '아무개'에게 인사를 하는 메소드를 만드시오.
		
		hello2();
		System.out.println();
		
		//수정사항] 우리 강의실 모든 사람에게 각각 인사를 하는 메소드를 만드시오.
		//  	 x 30개 매소드 선언
		// 		 x 1개 메소드 + 매개변수 사용
		
		//수정사항] 지구상의 모든 사람에게 각각 인사를 하는 메소드를 만드시오.
		//		 x 70억 메소드 선언
		//		 x 1개 메소드 + 매개변수
		
		//에러메시지 - The method hi(String) in the type Ex16_Method is not applicable for the arguments ()
		//hi();
		
		
		//메소드 1개!!!! > 여러 사람을 대상으로 사용 중
		
		hi("홍길동");
		System.out.println();
		
		hi("아무개");
		System.out.println();
		
		hi("test");
		System.out.println();
		
		hi("바이든");
		System.out.println();
		
		
	}//main
	
	public static void hello() {
		
		String name = "홍길동";
		
		System.out.println("자바 수업에 오신걸 환영합니다.");
		System.out.println( name + "님 안녕하세요.");
		System.out.println("열심히 공부하세요.");
		
	}
	
	public static void hello2() {
		
		String name = "아무개";
		
		System.out.println("자바 수업에 오신걸 환영합니다.");
		System.out.println( name + "님 안녕하세요.");
		System.out.println("열심히 공부하세요.");
		
	}
		
	//String name
	// = 인자
	// = 파라미터
	// = 매개변수
	
	//전역 검색 기능 - 프로젝트 내의 모든 파일을 대상으로 검색하는 기능
	//전역 검색 기능 > 확장 프로그램(Plugin) 설치 > "Quick Search" > "Ctrl + Shift + L"
	
	//변수는 초기화하지 않은 상태(null)로 사용이 불가능하다.
	
	//- 메소드 선언시에는 값이 정해져있지 않지만
	//- 호출할때 값을 전달함으로써 해당 메소드가 그 값을 가지고 행동을 할 수 있돋록 해주는 요소
	
	public static void hi(String name) {
		
		
		System.out.println("자바 수업에 오신걸 환영합니다.");
		System.out.println( name + "님 안녕하세요.");
		System.out.println("열심히 공부하세요.");
	
	}
		
		
		
		
	}//main


