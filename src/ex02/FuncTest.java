package ex02;

import java.util.Scanner;

public class FuncTest {
	// Field 전역변수
	//입력
	private static int num;
	private static String name;
	private static int kor;
	private static int eng;
	private static int mat;

	//출력
	private static int tot;
	private static double avg;
	
	public static void main(String[] args) {
		// 함수테스트
		/*
		 여러줄 주석처리할때 
		 
		 입력
		 num  name kor  eng  mat
		 번호 이름 국어 영어 수학
		  1,안유진,90,80,70
		  2, 카리나 , 100, 90 ,90 
		  3,장원영,100,100,100
		  4,닝닝,79,80,0
		  
		  출력
		  번호 이름 총점 평균
		 */
		
		input();
		
		process();
		
		output();
		
		System.out.println("end ..........");
	}

	// input
	private static void input() {
		//키보드 준비
		Scanner in = new Scanner(System.in);
		/*int값 받고 엔터를 치는 순간 아래 nextline이 반응함
		ai 답변으로는 nextline이 반응 하기때문에 빈값 입력 한번 더하는것
		즉 in.nextline()을 한번 더 입력하고 이름입력하라고 하는것과
		처음 받는 값을 int형이 아닌 String형으로 받은 후 int형으로 변환하기
		String를 한번 입력 받는것이라면 그냥 형변환 하면 되지만 여러번 반복된다면
		빈값을 한번더 받는게 나을듯.		
		*/
		/*
		System.out.println("번호를 입력 하세요");
		num = in.nextInt();
		in.nextLine();
		System.out.println("이름을 입력 하세요");
		name = in.nextLine();
		System.out.println("국어 점수를 입력하세요");
		kor = in.nextInt();
		System.out.println("영어 점수를 입력하세요");
		eng = in.nextInt();
		System.out.println("수학 점수를 입력하세요");
		mat = in.nextInt();
		*/
		// 입력방식 변경
		System.out.println("ex) 1,안유진,90,80,70");
		System.out.println("번호,이름,국어,영어,수학");
		String line = in.nextLine();
		String [] li = line.split(","); // 문자열을 ,를 기준으로 문자열 배열로 만들어줌 
		// line = "1,안유진,90,80,70"
		// li = 0       1       2     3     4
		//      "1" "안유진"  "90"  "80"  "70"
		
		num = Integer.parseInt(li[0].trim());
		name = li[1].trim();
		kor = Integer.parseInt(li[2].trim());
		eng = Integer.parseInt(li[3].trim());
		mat = Integer.parseInt(li[4].trim());
		//.trim() 은 공백을 없애는 함수
		
		
		
	}
	// process
	private static void process() {
		// 총점 평균 계산하는곳
		tot = kor+eng+mat;
		//avg = (double)tot / 3.0;
		//아래 강제형변환 실수를 정수로
		avg = (int)(tot * 100 + 0.5) / 100.0;
		//형변환 casting
		//숫자->문자열로 변환
		//String.valueOF(35.6); ->"35.6"
		//35.6 + "" 			->"35.6"
		//숫자와 문자를 붙이면 글자가 됨
	}

	// output
	private static void output() {
		//출력할때 %d는 int %s는 String %f는 실수 
		System.out.println("번호 이름   총점  평균");
		System.out.printf("%d   %s  %d    %10.3f" , num, name, tot, avg);
		//반올림 .3f .이하 3자리 이후 숫자를 반올림 
		System.out.println();
		//System.out.println("번호는 " + num +"  이름은 " + name + " 국어 점수는 " + kor + " 영어 점수는 " + eng + " 수학점수는 " + mat);
		//System.out.println("총점은 : " + tot + " 평균 점수는" + avg);
		
	}

}
