class Task5{
public static void main(String args[]){
	int arr[]={1,34,98,43,90,23,65};
	int max=0;
	for(int i=0;i<arr.length;i++){
		if(max<arr[i])
		max=arr[i];
	}
	System.out.println("Largest Element of Array is "+max);
}
}