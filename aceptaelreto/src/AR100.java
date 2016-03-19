import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Peter
 * @see https://www.aceptaelreto.com/problem/statement.php?id=100
 * @result AC // Tiempo: 1.6 // Memoria: 3585 // Pos: 388
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
		char[] rnumero = new char[4];
		char low1, low2, lowest, high1, high2, highest, middle1, middle2;
	    
		if (cnumero[0] < cnumero[1]) {
	    	low1 = cnumero[0];
	    	high1 = cnumero[1];
	    } else {
	    	low1 = cnumero[1];
	    	high1 = cnumero[0];
	    }

		if (cnumero[2] < cnumero[3]) {
			low2 = cnumero[2];
			high2 = cnumero[3];
		} else {
			low2 = cnumero[3];
			high2 = cnumero[2];
		}
		
		if (low1 < low2) {
			lowest = low1;
			middle1 = low2;
		} else {
	        lowest = low2;
	        middle1 = low1;
		}
		
	    if (high1 > high2) {
	        highest = high1;
	        middle2 = high2;
	    } else {
	        highest = high2;
	        middle2 = high1;
	    }

    	cnumero[0]=lowest;
    	cnumero[3]=highest;
	    if (middle1 < middle2) {
	    	cnumero[1]=middle1;
	    	cnumero[2]=middle2;
	    } else {
	    	cnumero[1]=middle2;
	    	cnumero[2]=middle1;
	    }
	    
	    rnumero[0]=cnumero[3];
	    rnumero[1]=cnumero[2];
	    rnumero[2]=cnumero[1];
	    rnumero[3]=cnumero[0];
	    
		short inumeronormal = Short.valueOf(new String(cnumero));
		short inumeroreverso = Short.valueOf(new String(rnumero));

		short resta=(short) (inumeronormal-inumeroreverso);
		if (resta==0) return 8;
		if (resta<0) resta=(short) -resta;
		
		contador++;
		return Kaprekar(resta);
	}
}