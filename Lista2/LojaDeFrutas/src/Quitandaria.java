// Uma loja de venda de frutas está vendendo frutas com a seguinte tabela de preços:

// - Até 5 Kg: Morango R$ 2,50 por Kg e Maçã R$ 1,80 por Kg
// - Acima de 5 Kg: Morango R$ 2,20 por Kg e Maçã R$ 1,50 por Kg

// Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.



import java.util.Scanner;

public class Quitandaria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double qtdMorango, qtdMaca, valorAPagar;
        
        System.out.println("Quantos quilos de morango você deseja? ");
        qtdMorango = teclado.nextDouble();

        System.out.println("Quantos quilos de maçã você deseja? ");
        qtdMaca = teclado.nextDouble();

        

    }
}
