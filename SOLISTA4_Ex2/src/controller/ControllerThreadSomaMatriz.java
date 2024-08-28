
package controller;

public class ControllerThreadSomaMatriz extends Thread {
    
    private int indice;
    private int[] linha;
   

	public ControllerThreadSomaMatriz (int indice, int[] linha) {
        this.linha = linha;
        this.indice = indice;
	}

	public void run(){
		calc();
	}

        private void calc (){
        int soma = 0;
        for (int num : linha) {
            soma = soma + num;
        }
        StringBuilder linhaString = new StringBuilder();

        for (int i = 0; i < linha.length; i++) {
            linhaString.append(linha[i]);
            if (i < linha.length - 1) {
                linhaString.append(" + "); 
            }
        }

        System.out.println("Linha " + indice + ": " + linhaString + " = " + soma);
    }
}
       
