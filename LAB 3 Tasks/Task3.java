import java.util.*;
class Task3{
	public static void main(String args[]){
		Scanner scanf=new Scanner(System.in);
		System.out.print("Enter a Character:");
		String a=scanf.next();
		switch(a){
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":
			System.out.println("Vowel");
			break;
			default:
			System.out.println("Not Vowel");
		}
	}
}