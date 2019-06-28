import java.util.Scanner;
class Task4{
	public static void main(String args[]){
		Scanner scanf=new Scanner(System.in);
		int m=0,n=0;
		System.out.print("Enter Dimensions of Matrices:(Rows and Column Respectively)");
		m=scanf.nextInt();
		n=scanf.nextInt();
		int a[][]=new int[m][n];
		int b[][]=new int[m][n];
		int c[][]=new int[m][n];
		System.out.println("Enter Matrices Make Sure you write one element o single line");
		System.out.println("Enter matrix A of order"+m+"*"+n);
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				a[i][j]=scanf.nextInt();
			}
		}
		System.out.println("Enter matrix B of order"+m+"*"+n);
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				b[i][j]=scanf.nextInt();
			}
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Sum of Matrices is :");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}