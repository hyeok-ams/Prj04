package ex01;

public class ArrayTest02 {

	public static void main(String[] args) {
		//
		int [] sales = new int[] {
			100, 80, 90, 110	
		};
		int sum = 0;
		for (int i = 0; i < sales.length; i++) {
			sum = sum + sales[i];
		}
		
		int [][] sales2 = new int [][] {
			{100,80,90,110},
			{70,110,80,100,20},
			{70,80,90}
		};
		int sum2 = 0;
		for (int i = 0; i < sales2.length; i++) {
			for (int j = 0; j < sales2[i].length; j++) {
				sum2 = sum2 + sales2[i][j];
			}
		}
		System.out.println("sum의 합은 "+ sum);
		System.out.println("sum2의 합은 "+ sum2);
		//2차원배열 연습
	}
	
}
