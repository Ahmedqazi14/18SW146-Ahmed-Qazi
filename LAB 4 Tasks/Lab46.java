import java.util.Scanner;
class Task6{
	public static void main(String args[]){
		Scanner scanf=new Scanner(System.in);
		int arr[]={1,5,3,8,27,34};
		System.out.println("Enter Number for Search");
		int no=scanf.nextInt();
		int position=0;
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(no==arr[i]){
				count=0;
				position=i+1;
				break;
			}else{
				count++;
			}
		}
		if(count==0)
			System.out.println("Number Found at Position "+position);
		else 
			System.out.println("Not found!");

	}
}