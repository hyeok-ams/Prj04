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
		//----------------------------------
		//2차원배열 연습 
		double [][] salesTot = new double[][] {
			// 1/4 2/4 3/4 4/4
			//   0   1   2    3   4  5   6
			{  100, 80, 90, 120}, //2022 실적 : salesTot[0]
			{  110, 70, 80, 100}, //2023 실적 : salesTot[1]
			{  120, 30, 50, 110, 10, 3, 10}, //2024 실적 : salesTot[2]
			{  110, 40, 70, 140}, //2025 실적 : salesTot[3]
			{   90,100, 80, 130}  //2026 실적 : salesTot[4]
		};
		
		System.out.println("연도의 갯수: "+ salesTot.length);
		System.out.println("2024년 매출갯수: " + salesTot[2].length);
		System.out.println(salesTot[3][1]);
		
		//2024년 매출수량의 합?
		sum = 0;
		// sum += salesTot[2][0];
		// sum += salesTot[2][1];
		// sum += salesTot[2][2];
		// sum += salesTot[2][3];
		// sum += salesTot[2][4];
		// sum += salesTot[2][5];
		// sum += salesTot[2][6];
		
		for (int i = 0; i < salesTot[2].length; i++) {
			sum += salesTot[2][i];
		}
		System.out.println("2024년 매출수량의 합은:"+sum);
		int allTotal = 0;
		for (int i = 0; i < salesTot.length; i++) {
			for (int j = 0; j < salesTot[i].length; j++) {
				allTotal += salesTot[i][j];
			}
		}
		System.out.println("총 마출 수량의 합은: " + allTotal);
	}
	
}
