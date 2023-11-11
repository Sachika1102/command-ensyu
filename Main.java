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
	}
}
