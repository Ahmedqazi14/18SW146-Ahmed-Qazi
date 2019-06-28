class Task5{
	public static void main(String args[]){
		byte a=2,b=3;
		int c;
		c=a&b;
		System.out.println("Value of a and b:"+a+" "+b);
		System.out.println("Bitwise and Operator:"+c);
		c=a|b;
		System.out.println("Bitwise or Operator:"+c);
		c=~a;
		System.out.println("Bitwise not Operator on a:"+c);
		c=~b;
		System.out.println("Bitwise not Operator on b:"+c);
		c=a^b;
		System.out.println("Bitwise xor Operator:"+c);
		c=a<<b;
		System.out.println("Bitwise Left Shift Operator:"+c);
		c=16>>2;
		System.out.println("Bitwise right Shift Operator:"+c);
		c=5>>>2;
		System.out.println("Bitwise  Operator:"+c);
	}
}