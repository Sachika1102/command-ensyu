import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Bmi{
	public static void main(String[] args){
		System.out.println("1人目のBMIを表示");
		System.out.println("身長");
		Scanner scanner = new Scanner(System.in);
		double height = Integer.parseInt(scanner.nextLine());
		System.out.println("体重");
		double weight = Integer.parseInt(scanner.nextLine());

		double result = weight / (height * height)*10000;
		
		BigDecimal bmi = new BigDecimal(result);
		bmi = bmi.setScale(2,RoundingMode.HALF_UP);
		System.out.println("BMIは" + bmi + "です");

		System.out.println("2人目のBMIを表示");
		System.out.println("身長");

		double height2 = Integer.parseInt(scanner.nextLine());
		System.out.println("体重");
		double weight2 = Integer.parseInt(scanner.nextLine());

		double result2 = weight / (height * height)*10000;

		BigDecimal bmi2 = new BigDecimal(result2);
		bmi2 = bmi2.setScale(2,RoundingMode.HALF_UP);
		System.out.println("BMIは" + bmi2 + "です");
	}
}
