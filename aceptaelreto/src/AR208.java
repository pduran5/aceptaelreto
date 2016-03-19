import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Peter
 * @see https://www.aceptaelreto.com/problem/statement.php?id=208
 * @result AC // Tiempo: 3.391 // Memoria: 3585 // Pos: 42
 */

public class AR208 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		
		while (!(linea = br.readLine()).equals("0 0")) {
			String[] s = linea.split(" ");
			int numFil = Integer.parseInt(s[0]);
			int fila = Integer.parseInt(s[1]);
			
			int tirados = 0;
			for (int i = numFil; i > (numFil - fila) + 1; i--)
				tirados += numFil - (numFil - i);
			System.out.println(tirados);
		}
	}
}

