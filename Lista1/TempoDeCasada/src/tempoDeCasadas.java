
/*
 Faça um algoritmo que leia o nome, o sexo e o estado civil de uma pessoa. Caso sexo seja “F” e
estado civil seja “CASADA”, solicitar o tempo de casada (anos).
*/

import java.util.Scanner;

public class tempoDeCasadas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome, sexo, estadoCivil;
        int tempoDeCasada;

        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();

        System.out.println("Digite seu sexo: ");
        sexo = teclado.nextLine();

        System.out.println("Digite seu estado civil: ");
        estadoCivil = teclado.nextLine();
        
        if( sexo.equals("f") && estadoCivil.equals("CASADA")){
            System.out.println("Digite quanto tempo de casada: ");
            tempoDeCasada = teclado.nextInt();
        }
    }
}
