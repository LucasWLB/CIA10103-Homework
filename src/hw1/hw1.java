package hw1;

public class hw1 {
	public static void main(String[] args) {
//	• 請設計一隻Java程式,計算12,6這兩個數值的和與積
		int a = 12, b = 6;
		System.out.println(a+b);
		System.out.println(a*b);
//	• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int egg = 200;
		System.out.println(egg/12 + "打" + egg%12 + "顆");
//	• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int all = 256559;
		System.out.println(all/(60*60*24)+"天"+all%(60*60*24)/(60*60)+"小時"+all%(60*60)/60+"分"+all%60+"秒");
//	• 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		double pi = 3.1415, r = 5;
		System.out.println("圓面積 = "+(r*r*pi));
		System.out.println("圓周長 = "+(2*r*pi));
//	• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//	金加利息共有多少錢 (用複利計算,公式請自行google) 
//		本利和=本金*(1+月利率)^期數
//				本金=存戶於期初所約定一次存入之金額
//				月利率=年利率/12
		int money = 1500000;
		System.out.println(money*(1+0.02)*10);
//	• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//	5 + 5
		System.out.println(5 + 5); //數字相加
//	5 + ‘5’
		int c = 5;
		char d ='5';
		System.out.println(c + d); //5加上5的Unicode
//	5 + “5”
		int e = 5;
		String f = "5"; 
		System.out.println(e + f); //5加上5的字元
//	並請用註解各別說明答案的產生原因
	}
}
