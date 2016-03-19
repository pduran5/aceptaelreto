import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

/**
 * @author Peter
 * @see https://www.aceptaelreto.com/problem/statement.php?id=116
 * @result AC // Tiempo: 0.008 // Memoria: 83 // Pos: 124
 */

public class AR116 {
	public static void main(String[] args) throws IOException {
		BufferedInputStream in = new BufferedInputStream(System.in, 1);
		BufferedOutputStream out = new BufferedOutputStream(System.out);
		byte c = (byte) in.read();
		for (byte i=0; i<c-48; i++) { out.write(("Hola mundo.\n").getBytes()); out.flush(); }
	}
}