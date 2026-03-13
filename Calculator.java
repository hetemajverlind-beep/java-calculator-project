import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	
	double num1;
	double num2;
	char operatori;
	double rez = 0;
	
	
	System.out.print("Write the first number : ");
	num1 = scan.nextDouble();
	
	System.out.print("Write the second number : ");
	num2 = scan.nextDouble();
	scan.nextLine();	
	
	System.out.print("Write the operand : ");
	operatori = scan.nextLine().charAt(0);
	
	switch(operatori){
		case '+' -> rez = num1 + num2;
		case '-' -> rez = num1 + num2;
		case '*' -> rez = num1 + num2;
		case '/' ->{ 
		if(num2 == 0){
			System.out.println("can't devide by 0");
		
		}
		else{
			rez = num1 / num2;
		}
		}
		
		default -> System.out.println(operatori +" is not a valid operator");
		
	}
	
	
	System.out.println(rez);
	
	
	
	
	
	
	
	
	}













}