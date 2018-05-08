import java.util.Scanner;

public class no5 {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan kata kata yang akan dihitung: ");
		String kata = input.nextLine();
		
		System.out.print("Jumlah katanya adalah: " +hit(kata));
	}
	
	public static int hit(String kata){
		int a = 0;
		if(!(" ".equals(kata.substring(0,1))) || !(" ".equals(kata.substring(kata.length() - 1)))){
			for(int b = 0; b < kata.length(); b++){
				if(kata.charAt(b) == ' '){
					a++;
				}
			}
		}return a;
	}
    
}