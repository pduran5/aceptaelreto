import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Peter
 * @see https://www.aceptaelreto.com/problem/statement.php?id=116
 * @result AC // Tiempo: 0.024 // Memoria: 83 // Pos: 478
 */

public class AR116 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		byte n = new Byte(br.readLine());
		for (byte i=0; i<n; i++) System.out.println("Hola mundo.");
	}
}