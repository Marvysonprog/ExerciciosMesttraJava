/*
 Faça um algoritmo que leia uma variável e some 5 caso seja par ou some 8 caso seja ímpar,
imprimir o resultado desta operação. 
 */

import java.util.Scanner;

public class Somando5ou8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero; 

        System.out.print("Digite um numero: ");
        numero = teclado.nextInt();

        if(numero % 2 == 0){
            System.out.println("O numero digitado foi par, acrescimo de cinco: " + (numero + 5));
        } else {
            System.out.println("O numero digitado foi impar, acrescimo de oito: " + (numero + 8));
        }
        teclado.close();
    }
}
