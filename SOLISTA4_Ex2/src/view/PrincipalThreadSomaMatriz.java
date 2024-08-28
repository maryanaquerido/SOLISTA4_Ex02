package view;
import controller.ControllerThreadSomaMatriz;
public class PrincipalThreadSomaMatriz {
    public static void main (String [] args){
        
        int[][] mat = new int[3][5];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = (int) (Math.random() * 100) + 1;
            }
        }
         for (int i = 0; i < mat.length; i++) {
            ControllerThreadSomaMatriz thread = new ControllerThreadSomaMatriz(i + 1, mat[i]);
            thread.start();
        }
    }
}
    

