package ex01;

public class ArrayTest04 {

	public static void main(String[] args) {
		// 배열 4번째 예제
		// 함수에 배열 넣는 방법
		// 배열 선언할때 초기값이 없으면 new 변수종류(String) 생략 가능
		
		String [] bts = {
			"RM" , "제이홉", "정국", "지민", "진", "슈가", "뷔"
		};
		System.out.println("");
		
		//함수에 배열자체를 넘긴 후 진행 배열 넘길땐 변수명으로 [] 생략가능 
		hellobts(bts);

	}

	private static void hellobts(String[] bts) {
		// 맴버들을 출력해주는 함수(반복문 for을 사용)
		for (int i = 0; i < bts.length; i++) {
			System.out.println("BTS 멤버의 이름은: " + bts[i]);
		}
	}


}
