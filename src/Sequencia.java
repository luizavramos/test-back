import java.lang.reflect.Array;
import java.util.Arrays;

public class Sequencia {

    public static void main(String[] args) {
        int[][] sequencias = new int[4][7];

        buildSequence(sequencias);

        for (int i = 1; i < sequencias[0].length; i++){
            sequencias[0][i] = sequencias[0][i - 1] + 2;

            if(i < sequencias[0].length - 1)
                sequencias[1][i + 1] = sequencias[1][i - 1] + sequencias[1][i];

            sequencias[2][i] = (sequencias[2][i - 1]  * 2) - 1;

            sequencias[3][i] = sequencias[3][i - 1] + 2;
        }

        for ( int[] row: sequencias){
            for (int data: row) {
                System.out.print(data + ", ");
            }
            System.out.println("");
        }

    }

    private static void buildSequence(int[][] sequencias) {
        // Sequencia soma 2
        sequencias[0][0] = 2;

        // Sequencia Fibonnaci
        sequencias[1][0] = 1;
        sequencias[1][1] = 1;

        // Sequencia Soma numero anterior
        sequencias[2][0] = 3;

        // Sequencia soma 2
        sequencias[3][0] = 1;
    }
}
