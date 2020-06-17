package quizzes;

import java.util.Scanner;

public class Quiz_2 {

	public static void main(String[] args) {
		//declared doubles Celsius and Fahrenheit
		double temp_c, temp_f;
		
		//Scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter "
				+ "a temperature in Celsius");
		temp_c = input.nextDouble();
		input.close();
		
		//Fahrenheit = 9/5 * Celsius + 32
		//convert 9/5 to 9.0/5.0 to get double
		temp_f = ((9.0/5.0) * temp_c) + 32;
		
		//output
		System.out.println(temp_c + " degrees Celsius is equal"
				+ " to " + temp_f 
				+ " degrees Fahrenheit.");
	}

}
