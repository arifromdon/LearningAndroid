import java.util.Scanner;

public class no3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Masukan angka: ");
		String a = input.nextLine();
		System.out.print("adalah " +pos(a));
		} 
				
	public static String pos(String a){
		int b;
		int c;
		
		if(a.length() % 2 == 0){
			b = a.length() /2 -1;
			c = 2;
		}
		else{
			b = a.length() / 2;
			c = 1;
		}
		return a.substring(b,b+c);
	}
	 
    
}