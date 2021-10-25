package Method;

public class Method06 {
	
public static void main(String[] args) {
		
		//[Method]
		
		//메소드 용법
		// -> swap 업무 > 2개의 값을 서로 교환하는 작업
		
		int a = 10;
		int b = 20;
		
		swap(a, b); //a -> b, b -> a
		
		String s1 = "홍길동";
		String s2 = "아무개";
		
		swap(s1, s2);
		
		
		boolean b1 = true;
		boolean b2 = false;
		
		swap(b1, b2);
		
		//탭키로 열 꼭 잘 맞추기
		//들여쓰기(indent)
		//- 탭(<-,->)
		//- 스페이스
		
		//형식 재정비
		//-Ctrl + Shift + F(format)
				
		
	}
	
	public static void swap(boolean s1, boolean s2) {

		System.out.printf("s1: %b, s2: %b\n", s1, s2);

		boolean s3; // 빈컵

		s3 = s1;
		s1 = s2;
		s2 = s3;

		System.out.printf("s1: %b, s2: %b\n", s1, s2);
	}
	
	public static void swap(String s1, String s2) {
		
		//printf에서 개행문자 -> %n 권장 -> 운영체제에 맞는 개행문자로 동작
		// - \r\n : window
		// - \r : macos
		// - \n : linux
		System.out.printf("s1: %s, s2: %s/n", s1, s2);
		
		String s3; //빈컵
		
		s3 = s1;
		s1 = s2;
		s2 = s3;
		
		System.out.printf("s1: %s, s2: %s\n", s1, s2);
	
	}
	
	public static void swap(int a, int b) {

		System.out.printf("a: %d, b: %d\n", a, b);

		// swap 작업
		int temp; // 빈컵

		temp = a;
		a = b;
		b = temp;

		System.out.printf("a: %d, b: %d\n", a, b);
	}

}
