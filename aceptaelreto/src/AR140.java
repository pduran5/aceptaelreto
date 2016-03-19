import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Peter
 * @see https://www.aceptaelreto.com/problem/statement.php?id=140
 * @result AC // Tiempo: 1.139 // Memoria: 3585 // Pos: 396
 */

public class AR140 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int numero;
		do {
			numero=in.nextInt();
			if(numero>=0) sumadigitos(numero);
		} while(numero>=0);
		in.close();
	}

	private static void sumadigitos(int numero) throws IOException {
		BufferedOutputStream out = new BufferedOutputStream(System.out);
		int n=String.valueOf(numero).length();
		int suma=0;
		int[] k=new int[10];
		for(int i=0; i<n; i++) {
			k[i]=numero%10;
			suma+=k[i];
			numero/=10;
		}
		for (int i=n-1; i>=0; i--) {
			out.write((""+k[i]).getBytes());
			if(i!=0) out.write((" + ").getBytes());
		}
		out.write((" = "+suma+"\n").getBytes());
		out.flush();
	}
}
