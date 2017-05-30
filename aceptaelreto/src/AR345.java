import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Peter
 * @web https://www.aceptaelreto.com/problem/statement.php?id=345
 * @result AC
 */
public class AR345 {

    private static int[][] sudoku;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sudoku = new int[9][9];
        int casos = Integer.valueOf(br.readLine());
        for (int i = 0; i < casos; i++) {
            for (int j = 0; j < 9; j++) {
                String[] line = br.readLine().split(" ");
                for (int k = 0; k < 9; k++) {
                    sudoku[j][k] = Integer.parseInt(line[k]);
                }
            }
            System.out.println(isValidSudoku() ? "SI" : "NO");
        }
    }

    private static boolean isValidSudoku() {
        int x1,x2,y1,y2;
        for(int row=0; row<9; row++) {
            for(int column=0; column<9; column++) {
                for (int i = 0; i < 9; i++) {
                    if (i != column)
                        if (sudoku[row][column] == sudoku[row][i]) return false;

                    if (i != row)
                        if (sudoku[row][column] == sudoku[i][column]) return false;
                }

                x1 = 3 * (row / 3);
                y1 = 3 * (column / 3);
                x2 = x1 + 2;
                y2 = y1 + 2;

                for (int x = x1; x <= x2; x++)
                    for (int y = y1; y <= y2; y++)
                        if(x!=row && y!=column)
                            if (sudoku[x][y] == sudoku[row][column])
                                return false;
            }
        }
        return true;
    }
}
