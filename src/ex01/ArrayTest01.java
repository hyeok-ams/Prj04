package ex01;

public class ArrayTest01 {
	//array : 여러변수를 하나의 이름으로 통일해서 사용
	public static void main(String[] args) {
		// 배열작업
		//안유진 가을 레이 장원영 리즈 이서
		
		String name1 = "안유진";
		String name2 = "가을";
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println("레이");
		System.out.println("장원영");
		System.out.println("리즈");
		System.out.println("이서");
		System.out.println();
		//배열 선언 후 값 입력
		String[] ives = new String[] {
				"안유진", "가을", "레이",
				"장원영", "리즈", "이서"
		};
		
		System.out.println(ives[0]);
		System.out.println(ives[1]);
		System.out.println(ives[2]);
		System.out.println(ives[3]);
		System.out.println(ives[4]);
		System.out.println(ives[5]);
		System.out.println();
		
		String[] ives2 = new String[3];
		ives2[0]="안유진";
		ives2[1]="가을";
		ives2[2]="레이";
		
		for(int i = 0;i<ives.length; i++)
		{
			System.out.println(ives[i]);
			
		}
		System.out.println();
		for(int i = 0; i<ives2.length; i++)
		{
			System.out.println(ives2[i]);
		}
		System.out.println();
	}

}
