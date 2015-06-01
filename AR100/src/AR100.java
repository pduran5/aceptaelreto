import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Peter
 * @see https://www.aceptaelreto.com/problem/statement.php?id=100
 * @result AC // Tiempo: 1.804 // Memoria: 3585 // Pos: 392
 */

public class AR100 {
	static byte contador=0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int casos = Short.valueOf(br.readLine());
		for (int i = 0; i < casos; i++) {
			System.out.println(Kaprekar(Short.valueOf(br.readLine())));		
			contador=0;
		}
	}

	private static short Kaprekar(short numero) {
		if(numero==6174) return contador;
		char[] cnumero = String.format("%04d", numero).toCharArray();
		Arrays.sort(cnumero);
		
		short inumeronormal = Short.valueOf(new String(cnumero));
		short inumeroreverso = Short.valueOf(new StringBuilder(new String(cnumero)).reverse().toString());

		if (inumeronormal == inumeroreverso) return 8;
		
		short resta=(short) Math.abs(inumeronormal-inumeroreverso);
		contador++;
		return Kaprekar(resta);
	}
}