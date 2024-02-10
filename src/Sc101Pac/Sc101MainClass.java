package Sc101Pac;

import java.util.Scanner;

public class Sc101MainClass {

	public static void main(String[] args) {
		// Declare the variable 
		//Summation variables
		System.out.println("Summation Process :");
		int number1;
		int number2;
		//declare the variable to store the value of summation
		int sum;
		
//initialization
		Scanner sc1=new Scanner(System.in);
		System.out.println("Please enter the number 1 and press Enter:");
		number1=sc1.nextInt();
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("Please enter the number 1 and press Enter:");
		number2=sc2.nextInt();
		
		//process
		sum=number1+number2;
		
		//output
		System.out.println("The summation is :"+sum);
		
		
		
		//subtraction variables
		System.out.println("Subtraction Process :");
		int number3;
		int number4;
		//declare the variable to store the value of subtraction
		int sub;
		
		Scanner sc3=new Scanner(System.in);
		System.out.println("Please enter the number and press Enter:");
		number3=sc3.nextInt();
		
		Scanner sc4=new Scanner(System.in);
		System.out.println("Please enter the number  and press Enter:");
		number4=sc4.nextInt();
		
		//process
		sub=number3-number4;
		
		//output
		System.out.println("The subtraction is :"+sub);
		
		
		
		
		
		//multiply variables
		System.out.println("Multiply Process :");
				int number5;
				int number6;
				//declare the variable to store the value of multiply
				int mul;
				
				Scanner sc5=new Scanner(System.in);
				System.out.println("Please enter the number and press Enter:");
				number5=sc5.nextInt();
				
				Scanner sc6=new Scanner(System.in);
				System.out.println("Please enter the number  and press Enter:");
				number6=sc6.nextInt();
				
				//process
				mul=number5*number6;
				
				//output
				System.out.println("The multiply is :"+mul);
				
				
				
				//division variables
				System.out.println("the division process ");
				int number7;
				int number8;
				//declare the variable to store the value of division
				int div;
				
				Scanner sc7=new Scanner(System.in);
				System.out.println("Please enter the number and press Enter:");
				number7=sc7.nextInt();
				
				Scanner sc8=new Scanner(System.in);
				System.out.println("Please enter the number  and press Enter:");
				number8=sc8.nextInt();
				
				//process
				div=number7/number8;
				
				//output
				System.out.println("The division is :"+div);
				
				//square variables
				System.out.println("the square of the the number");
				int number9;
				
				//declare the variable to store the value of square
				int sqr;
				
				Scanner sc9=new Scanner(System.in);
				System.out.println("Please enter the number  and press Enter:");
				number9=sc9.nextInt();
				
				//process
				sqr=number9*number9;
				System.out.println("The square is :"+sqr);
				
			
	}

}
