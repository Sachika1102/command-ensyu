import java.math.math.BigDecimal;
import java.math.RoundingMode;

public class main{
	public static void main(String[] args){
		System.out.println("1人目のBMIを表示");
		double height = 150.0;
		double weighe = 42.0;
		System.out.println("身長:" + height + "(cm)");
		System.out.println("体重:" + weight + "(kg)");

		double result = weight / (height * height)*10000;
		
		BigDecimal bmi = new BigDecimal(result);
		bmi = bmi.setScale(2,RoundingMode.HALF_UP);
		System.out.println("BMIは" + bmi + "です");

		System.out.println("2人目のBMIを表示");
		double height2 = 175.0;
		double weight2 = 65.0;
		System.out.println("身長:" + height2 + "(cm)");
		System.out.println("体重:" + weight2 + "(kg)");

		double result2 = weight / (height * height)*10000;

		BigDecimal bmi2 = new BigDecimal(result2);
		bmi2 = bmi2.setScale(2,RoundingMode.HALF_UP);
		System.out.println("BMIは" + bmi2 + "です");
	}
}
