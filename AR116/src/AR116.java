import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

/**
 * @author Peter
 * @see https://www.aceptaelreto.com/problem/statement.php?id=116
 * @result AC // Tiempo: 0.02 // Memoria: 83 // Pos: 261
 */

public class AR116 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		OutputStream out = new BufferedOutputStream(System.out);
		byte n = new Byte(br.readLine());
		for (byte i=0; i<n; i++) { out.write(("Hola mundo.\n").getBytes()); out.flush(); }
	}
}