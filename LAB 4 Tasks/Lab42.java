import java.util.Scanner;
class Table{
	public static void main(String args[]){
		Scanner scanf=new Scanner(System.in);
		System.out.println("Enter Number for printing a table");
		int table=scanf.nextInt();
		System.out.println("Enter Starting point of table table");
		int start=scanf.nextInt();
		System.out.println("Enter Ending point of table");
		int end=scanf.nextInt();
		for(int i=start;i<=end;i++){
			System.out.println(table+"x"+i+"="+(table*i));
		}
	}
}