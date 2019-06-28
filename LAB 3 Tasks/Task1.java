import java.util.*;
class Task1{
	public static void main(String args[]){
		Scanner scanf=new Scanner(System.in);
		int total=300;
		int obt=0;
		double percentage=0;
		System.out.println("Enter Obtained Marks in C++");
		int m1=scanf.nextInt();
		System.out.println("Enter Obtained Marks in Data Structure");
		int m2=scanf.nextInt();
		System.out.println("Enter Obtained Marks in Operating System");
		int m3=scanf.nextInt();
		obt=m1+m2+m3;
		percentage=obt*100/total;
		System.out.println("Marks in C++:"+m1);
		System.out.println("Marks in Data Structure:"+m2);
		System.out.println("Marks in Operating System"+m3);
		System.out.println("Total Obtained Marks"+obt);
		System.out.println("Total Marks"+total);
		System.out.println("Percentage:"+percentage);
		System.out.print("Graade:");
		if(percentage>90)
			System.out.print("A");
		else if(percentage>80 && percentage<90)
			System.out.print("B");
		else if(percentage>70 && percentage<80)
			System.out.print("C");
		else if(percentage>60 && percentage<70)
			System.out.print("D");
		if(percentage<60)
			System.out.print("Fail");
	}
}