import java.util.LinkedList;
import java.util.Scanner;

public class Ativ01 {

    /*
     * 1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores 
     * (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, 
     * ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
     * IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;
     */

    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        int numOpcao;
        int num;
        LinkedList<Integer> lista;

        while (true) {
            System.err.print(
                "-=-=-=-=-=-=-=-=-=-=-=- Menu =-=-=-=-=-=-=-=-=-=-=-=-" + "\n" + 
                "        [ 0 ] - Sair" + "\n" + 
                "        [ 1 ] - Consulta Fibonnaci" + "\n" + 
                "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-" + "\n" +
                "| Informe sua opção: "
            );
            numOpcao = teclado.nextInt();
            teclado.reset();

            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

            switch (numOpcao) {
                case 0:
                    teclado.close();
                    System.exit(0);
                    break;

                case 1:
                    System.out.print("| Informe o número desejado: ");
                    num = teclado.nextInt();
                    teclado.reset();

                    lista = fibonacci(num);

                    if (lista.contains(num)) {
                        System.out.println("O número " + num + " está presente na sequência de Fibonacci.");

                    } else {
                        System.out.println("O número " + num + " não está presente na sequência de Fibonnaci");
                    }

                    System.out.println("Fibonacci: " + lista);
                    break;

                default:
                    System.err.println("Opção não reconhecida, tente novamente.");
            }
        }
    }

     public static LinkedList<Integer> fibonacci(int num) {
        LinkedList<Integer> resultado = new LinkedList<Integer>();

        int soma = 0;
        int numAux1 = 1;
        int numAux2;
        
        resultado.add(0);
        while (soma < num) {
            numAux2 = soma;
            soma = numAux1 + soma;
            numAux1 = numAux2;
            resultado.add(soma);
        }

        return resultado;
     }
}
