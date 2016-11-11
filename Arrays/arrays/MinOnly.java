package arrays;

public class MinOnly {

	public static void main(String[] args)
	{
		
		int [] arr = new int[10];
		arr[0]= 3;
		arr[1]= -5;
		arr[2]= 9;
		arr[3]= 12;
		arr[4]= -2;			
		arr[5]= 25;
		arr[6]= 55;
		arr[7]= -10;
		arr[8]= 21;
		arr[9]= 98;
		
		int [] arr2 = {3, 1, -3, 8, 10, 11, 2,
				8, 3, 12};
		
		
		System.out.println("Testing MinOnly");
		findMin(arr);
		
		System.out.println("Testing MaxMin");
		findMaxMin(arr2);
		
			
		}

	
	public static void findMin(int[] a){
		int smallest = a[0];
		
		for(int i=0; i<10; i++){
			System.out.println("looking at index: " + i);
			if(a[i]<smallest){
				smallest = a[i];
				System.out.println("Found newest small value: " + smallest);
			}
			System.out.println("Our current smallest is: " + smallest);
			System.out.println("-------------\n");
			
		}
	}
	
	public static void findMaxMin(int[] a){
		int smallest = a[0];
		int largest = a[0];
		
		for(int i=0; i<10; i++){
			System.out.println("looking at index: " + i);
			if(a[i]<smallest){
				smallest = a[i];
				//if a[i] is smaller than the current smallest, make that the new smallest
				System.out.println("Found newest small value: " + smallest);
			}
			if(a[i]>largest){
				largest = a[i];
				//if a[i](current number in index) is greater than the current largest, make that the new largest
				System.out.println("Found newest large value: " + largest);
			}
			System.out.println("Our current smallest is: " + smallest);
			System.out.println("Our current largest is: " + largest);
			System.out.println("-------------\n");
			
		}
		System.out.println("========================");
		System.out.println("Smallest: " + smallest + ", Largest: " + largest);
		
	}

}


