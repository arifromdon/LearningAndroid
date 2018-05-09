
public class no4 {
	public static void main(String[]args){
		int[] rec = {78, 60, 62, 68, 71, 68, 73, 85, 66, 64, 76, 63, 75, 76, 73, 68, 62, 73, 72, 65, 74, 62, 62, 65, 64, 68, 73, 75, 79, 73};
		int sum = 0;
		for(int num = 0; num < rec.length; num++){
			sum = sum+rec[num];
		}
		
		double ave = sum/rec.length;
		
		System.out.println("average : "+ave);
		
		for(int i = 10; i < rec.length; i--){
				if(ave < rec[i])
					System.out.println("Largest Number is : " +rec[i]);	
				else if(ave > rec[i])
					System.out.println("Smallest Number is : " +rec[i]);		
		}
	}    
}