package arrays;

public class NumOccur {

	public static void main(String[] args) {
		int[] input = {1, 4, 3, 3, 0, 9, 6, 7, 5, 4, 7, 4, 8};
		int[] count = new int[10];
		
		
		
	for (int i = 0; i < input.length; i++)
		count [input[i]]++;

	for (int i = 0; i < count.length; i++)	
		System.out.print(count[i]+ ", ");
	
	}}
