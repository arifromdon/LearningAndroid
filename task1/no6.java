import java.util.Scanner;

public class no6 {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Input the invesment amount :");
		double invest = input.nextDouble();
		System.out.print("Input the rate of interest :");
		double interest = input.nextDouble(); 
		System.out.print("Input number of years :");
		int years = input.nextInt();
		
		interest *= 0.01;
		
		System.out.println("Years \t FutureValue");
		for(int a = 1; a <= years; a++){
			int f = 19;
			if(a >= 10)f = 18;
			System.out.printf(a + "%" +f+ ".2f\n", hit(invest, interest/12, a));
		}
		
	}
    
  public static double hit(double in, double it, int y){
  	return in * Math.pow(1 + it, y * 12);
  }  
}