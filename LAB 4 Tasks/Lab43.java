import java.util.Scanner;
class Task3{
	public static void main(String args[]){
		Scanner scanf=new Scanner(System.in);
		System.out.println("How many Numbers you want to add");
		int size=scanf.nextInt();
		int sum=0;
		int arr[]=new int[size];
		System.out.println("Enter "+size+" Numbers");
		for(int i=0;i<arr.length;i++){
			arr[i]=scanf.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		System.out.println("The Sum of Numbers is "+sum);

	}
}