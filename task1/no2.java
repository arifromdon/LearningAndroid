import java.util.Scanner;

public class no2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.printf("Masukan jumlah bilangan yang akan diurutkan: ");
		int jum = input.nextInt();
		
		int arr[] = new int[jum];
	
		for(int i = 0; i < jum; i++){
			System.out.printf("Masukan bilangan ke "+(i + 1)+":");
			arr[i] = input.nextInt();
			System.out.println();
		}
		
		System.out.println("Bilangan sudah disusun:");
		for(int a = 0; a < jum; a++){
			System.out.print(+arr[a]+" ");
		}
	
	}    
}