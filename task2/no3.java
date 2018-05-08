import java.util.Arrays;
import java.util.Scanner;


public class no3 {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int[] arr = {1, 2, 3, 4, 5};
		int pos = 3;
		int nilai = 20;
		
		System.out.println("Origin Array : "+Arrays.toString(arr));
		
		for(int i = arr.length-1; i > pos; i--){
			arr[i] = arr[i-1];
		}
		arr[pos] = nilai;
		
		System.out.println("Array Baru : "+Arrays.toString(arr));
	}   
}