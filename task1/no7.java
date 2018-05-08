
public class no7 {
	public static void main(String[] args) {
  	charr('(', 'z', 20);
  }
  public static void charr(char char1, char char2, int n) {
		for (int c = 1; char1 <= char2; c++, char1++) {
			System.out.print(char1 + " ");
	      if (c % n == 0) System.out.println("");
      }
		System.out.print("\n");
    }
}