package arrays;

public class CalcAvg {

	public static void main(String[] args) {
		
		int[] arr = {3, 1,  7, 8, 10, 11, 2, 8 , 3, 12};
		
		double average = calculateAverage(arr);
		
		System.out.println("Average: " + average);
	}

		public static double calculateAverage (int[] a){
		double sum = 0;
		double average = 0;
		for(int i=0; i<a.length; i++)
			sum = sum + a[i];
		average = sum/a.length;
		
		return average;
		
	}

}
