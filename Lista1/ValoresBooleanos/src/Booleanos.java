/*
Escreva um algoritmo que lê dois valores booleanos (lógicos) e então determina se ambos são
VERDADEIROS ou FALSOS. 
 */

import java.util.Scanner;

public class Booleanos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean estaChovendo ;
        boolean sairDeGuardaChuva;

        System.out.println("Esta chovendo? True/False");
        estaChovendo = teclado.nextBoolean();

        System.out.println("Vai sair de Guarda-Chuva? True/False");
        sairDeGuardaChuva = teclado.nextBoolean();

        if(estaChovendo && sairDeGuardaChuva){
            System.out.println("Verdadeiro");
        } else{
            System.out.println("Falso");
        }
        teclado.close();
    }
}
