import java.util.Scanner;

public class no4 {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan Kata: ");
		String mas = input.nextLine();
		System.out.print("Total huruf vokalnya adalah : "+cari(mas));
	}
	
	public static int cari(String mas){
		int a = 0;
		for(int b = 0; b < mas.length(); b++){
			if(mas.charAt(b) == 'a' || mas.charAt(b) == 'i' || mas.charAt(b) == 'u' || mas.charAt(b) == 'e' || mas.charAt(b) == 'o'){
				a++;
			}
		}
		return a;
	}
}
	
 
