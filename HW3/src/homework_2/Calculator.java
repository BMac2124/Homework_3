package homework_2;

 import java.util.Scanner;
 
public class Calculator {

	public static void main(String[] args) {
		double num1, num2; 
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first number!");
		/* By using a double we can allow the user input
		*to enter integer and a float value.*/
		
		num1=input.nextDouble();//input for the first integer
		System.out.println("Enter second number:");
		num2=input.nextDouble();//input for the second integer
		System.out.println("Enter the operator!");
		char operator = input.next().charAt(0);//sets the input for the operator character
		input.close();
		double sum;
		switch(operator)//param for the case char was set above case(+,-,*,/)
		{
		case'+': 
			sum= num1 + num2; 
			break; 
		case'-': 
			sum = num1-num2; 
			break;
		case'*': 
			sum = num1*num2;
			break;
		case'/': 
			sum = num1/num2; 
			break;
		default: 
		
			System.out.println("You entered the wrong Operator!");
			return;
		
		}
		
		System.out.println(sum);
	
	}

}
