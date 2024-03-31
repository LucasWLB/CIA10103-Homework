package hw1;

public class hw2 {
	

	
	public static void main(String[] args) {
//		• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
//		int a = 0,b;
//		for(b = 2; b <= 1000; b+=2) {
//			a+=b;
//		}
//		System.out.println(a);
//		• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
//		int c,d = 1;
//		for(c = 1; c <= 10; c++) {
//			d*=c;
//		}
//		System.out.println(d);
//			
//		• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
//		int e=1 ,f = 1;
//		while(f <= 10) {
//			e*=f;
//			f++;	
//		}
//		System.out.println(e);
//		• 請設計一隻Java程式,輸出結果為以下:
//		1 4 9 16 25 36 49 64 81 100
//		int g;
//		for(g = 1;g <= 10;g++) {
//			System.out.print(g*g+"\t");
//		}
//		• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//		輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		 int sum1 = 0, mul1 = 10; 
		 for (int lot = 1; lot <= 49 ; lot++) {
		 if (lot % mul1 == 4) { //剔除14 24 34 44
		 }
		 else if (lot / mul1 == 4) { 
		 }                     //剔除40 41 42 43 44 45 46 47 48 49
		 else {
		 System.out.print(lot + " ");
		 sum1++; //總號碼數
		 }
		 }
		 System.out.println("共" + sum1 + "個號碼");
		 System.out.println();
		
//		• 請設計一隻Java程式,輸出結果為以下:
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
//		for (int i = 11; i >= 1; i--) { //輸出後共10行，且為號碼數遞減
//		 for (int j = 1; j < i ; j++){//輸出1~10，每到下一行便少一個尾數
//			 System.out.print(j + " ");
//			 }
//			 System.out.println();
//			 }
//		• 請設計一隻Java程式,輸出結果為以下:
//			A
//			BB
//			CCC
//			DDDD
//			EEEEE
//			FFFFFF
//		int n1, n2, n3;
//		 for (n1 = 0; n1 <= 5; n1++) { //輸出後共5行，且為號碼數遞增
//		 for (n2 = 0; n2 <= n1; n2++) { //每到下一行便增加一個文字
//		 n3 = 65 + n1; 
//		 char n4 = (char)n3; //用char將ASCII數字編碼轉換為文字
//		 System.out.print(n4);
//		 }
//		 System.out.println();
//		 }
//		 }
		
	}
}
				

		

