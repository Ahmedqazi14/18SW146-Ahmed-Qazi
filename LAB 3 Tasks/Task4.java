import java.util.*;
class Task4{
	public static void main(String args[]){
		Scanner scanf=new Scanner(System.in);
		int result=0;
		System.out.println("Enter a Number:");
		int a=scanf.nextInt();
		System.out.println("Enter an Operator:");
		String ope=scanf.next();
		System.out.println("Enter a Number:");
		int b=scanf.nextInt();
		switch(ope){
			case "+":
			result=a+b;
			System.out.println("The Sum of "+a+" and "+b+" is "+result);
			break;
			case "-":
			result=a-b;
			System.out.println("The difference of "+a+" and "+b+" is "+result);
			break;
			case "*":
			result=a*b;
			System.out.println("The product of "+a+" and "+b+" is "+result);
			break;
			case "/":
			result=a/b;
			System.out.println("The Division of "+a+" and "+b+" is "+result);
			break;
			default:
			System.out.println("Invalid Operator");
		}
	}
}