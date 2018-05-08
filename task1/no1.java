import java.util.Scanner;

public class no1 {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int a = 0;
		int b = 0;
		double temp;
		System.out.printf("Masukan angka yang akan dipangkatkan: ");
		a = input.nextInt();
		System.out.printf("Masukan angka pangkatnya: ");
		b = input.nextInt();
		
		
		temp = Math.pow(a,b);
		System.out.printf("hasilnya adalah: " +temp);
		
					
	}    
}