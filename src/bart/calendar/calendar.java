package bart.calendar;
import java.util.Scanner;
import java.util.Calendar;

public class calendar {

	public int getMaxdays(int month) {
		
		int[] MaxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		return MaxDays[month-1];
	}
	
	public static void main(String[] args) {

//		System.out.println(" 일 월 화  수  목  금  토");
//		System.out.println("--------------------");
//		System.out.println(" 1  2  3  4  5  6  7");
//		System.out.println(" 8  9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");

		
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		
//		System.out.println("달을 입력하세요.");
//		Scanner scanner = new Scanner(System.in);
//		int num = scanner.nextInt();
//		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//		
//		if(num < 1) {
//			
//		}
//		System.out.printf("%d월은 %일까지 있습니다.\n", num , maxDays[num+1]);
		

		calendar cal = new calendar();
		
		System.out.println("반복횟수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] month = new int[num]; 
		
		
		System.out.println("월을 입력하세요.");
		for(int i = 0; i < num; i++) {
			month[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < num; i++) {
			System.out.println(month[i]+ "일은 " + cal.getMaxdays(month[i]) + "일까지 있습니다.");
		}

		
		
		
		scanner.close();
	}

}
