class Task1{
	public static void main(String args[]){
		String name="Qazi";
		long total_marks=500;
		int obtained_marks=377;
		float percentage=obtained_marks*100/total_marks;
		char grade='A';
		boolean b=obtained_marks>=33;
		System.out.println("Name of Student:"+name);
		System.out.println("Total Marks:"+total_marks);
		System.out.println("Obtained Marks:"+obtained_marks);
		System.out.println("Percentage:"+percentage);
		System.out.println("Grade:"+grade);	
		System.out.print("Status:");
		if(b)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
}