import java.util.Arrays;
import java.util.List;

public class no5 {
	public static void main(final String[] args) {
    List<String> colors = Arrays.asList("white", "green", "red", "blue", "black");

    colors.stream().map(name -> name.toUpperCase())
        .forEach(name -> System.out.print(name + " "));

  }
}