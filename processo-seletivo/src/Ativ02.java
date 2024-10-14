import java.util.Scanner;

public class Ativ02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("| Digite a frase à ser analisada: ");
        String frase = teclado.nextLine();

        if (frase.contains("a")) {
            System.out.println("A quantidade de A(s) na frase é igual à: " + contadorDeA(frase));

        } else {
            System.out.println("Não existem ocorrências da letra A na frase.");
            
        }
        
        teclado.close();
    }


    public static int contadorDeA (String frase) {
        int contA = 0;

        frase = frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++) {
            if (String.valueOf(frase.charAt(i)).equals("a") ) {
                contA++;
            }
        }

        return contA;
    }
}