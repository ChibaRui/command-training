import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		double height, weight,bmi;

		System.out.print("身長(m):");
		height = stdin.nextDouble();
		System.out.print("体重(kg):");
		weight = stdin.nextDouble();

		bmi = weight / (height * height);

		System.out.println("BMI:" + bmi);
	}
}
