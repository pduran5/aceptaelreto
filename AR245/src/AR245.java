import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Peter
 * @see https://www.aceptaelreto.com/problem/statement.php?id=245
 * @result MLE
 */

public class AR245 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (!br.readLine().equals("0")) {
			String[] daltons = br.readLine().split(" ");
			long tamdalton, tamano=0;
			boolean isDalton=true;
			for (String dalton : daltons) {
				tamdalton = Long.parseLong(dalton);
				if (tamano > tamdalton) { isDalton=false; break; }
				tamano = tamdalton;
			}
			System.out.println(isDalton ? "DALTON" : "DESCONOCIDOS");
		}		
	}
}