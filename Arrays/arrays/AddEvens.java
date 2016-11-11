package arrays;

public class AddEvens {

	public static void main(String[] args) {
		
		int[] arr1 = {3, 1, 7, 8, 10, 11, 2, 8, 3, 12};

		int sum = addEvenNum(arr1);
		System.out.println("Sum: " + sum);
	
	}

	
	public static int addEvenNum (int[] a){
	
	
	int sum = 0;
	
	for(int i = 0; i<a.length; i++)
		
		if(a[i] % 2 == 0)
			sum = sum + a[i];
			
			return sum;
}
}
		
