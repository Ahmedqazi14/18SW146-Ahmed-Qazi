import java.util.Scanner;
class Task3{
	public static void main(String args[]){
		Scanner scanf=new Scanner(System.in);
		System.out.println("How many numbers you want to add");
		int no=scanf.nextInt();
		int sum=0;
		System.out.println("Enter "+no+" Numbers");
		for(int i=1;i<=no;i++){
			int next=scanf.nextInt();
			sum+=next;
		}
		System.out.println("Sum of Entered numbers is "+sum);
	}
}