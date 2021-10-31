package bart.calendar;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		System.out.println("두 수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();

		System.out.printf("%d와 %d의 합은 %d입니다.", number1, number2, number1 + number2);
		scanner.close();

	}

}
