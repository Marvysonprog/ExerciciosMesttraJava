/*
 Faça um algoritmo para receber um número qualquer e informar na tela se é par ou ímpar. 
 */


import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.print("Digite um numero: ");
        numero = teclado.nextInt();

        if(numero % 2 == 0){
            System.out.println("O valor digita do é PAR");
        }else {
            System.out.println("O valor digitado é IMPAR");
        }
        teclado.close();
    }
}
