import java.util.*;
class Task2{
	public static void main(String args[]){
		Scanner scanf=new Scanner(System.in);
		int total=0;
		System.out.println("Enter No: of Unit Consumed:");
		int units=scanf.nextInt();
		for(int i=1;i<=units;i++){
			if(i<=50)
				total+=10;
			else if(i>50 && i<=100)
				total+=15;
			else if(i>100 && i<=200)
				total+=20;
			else if(i>200 && i<=300)
				total+=25;
			else if(i>300)
				total+=30;
		}
		System.out.println("Total Bill for "+units+" is "+total);
	}
}