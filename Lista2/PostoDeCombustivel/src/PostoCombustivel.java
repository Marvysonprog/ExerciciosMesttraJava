
/******************************************************************************
Exercício 02: Um posto está vendendo combustíveis com a seguinte tabela de descontos:


Álcool:

- até 20 litros, desconto de 3% por litro
- acima de 20 litros, desconto de 5% por litro


Gasolina:

- até 20 litros, desconto de 4% por litro
- acima de 20 litros, desconto de 6% por litro

Escreva um algoritmo que leia o número de litros vendidos,
o tipo de combustível como um número inteiro (codificado da seguinte forma: 1 - álcool, 2 - gasolina),
calcule e imprima o valor a ser pago pelo cliente sabendo-se que
o preço do litro da gasolina é R$ 5,50 e o preço do litro do álcool é R$ 3,90.

*******************************************************************************/
import java.util.Scanner;

public class PostoCombustivel {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numeroDeLitros, opcao;
        double precoLitroGasolina = 5.50, 
        precoLitroAlcool = 3.90, 
        porcentagem1 = 0.97, 
        porcentagem2 = 0.95, 
        total, soma;

        System.out.print("Digite o tipo de combustível que deseja abastecer: (1) para Álcool ou (2) para Gasolina: ");
        opcao = teclado.nextInt();

        System.out.print("Digite quantos litros você deseja: ");
            numeroDeLitros = teclado.nextInt();

        if (opcao == 1 && numeroDeLitros <= 20) {
            
            total = (precoLitroAlcool * numeroDeLitros);
            soma = total * porcentagem1;
            
            
            System.out.println("O total a pagar será R$" + soma + ".");

        } else if (opcao == 1 && numeroDeLitros > 20) {
            
            total = (precoLitroAlcool * numeroDeLitros);
            soma = total * porcentagem2;
           
            
            System.out.println("O total a pagar será R$" + soma + ".");

        } else if (opcao == 2 && numeroDeLitros <= 20) {
            
            total = (precoLitroGasolina * numeroDeLitros);
            soma = total * porcentagem1;
            
            
            System.out.println("O total a pagar será R$" + soma + ".");

        } else if (opcao == 2 && numeroDeLitros > 20) {
            
            total = (precoLitroGasolina * numeroDeLitros);
            soma = total * porcentagem2;
            
            
            System.out.println("O total a pagar será R$" + soma + ".");
         }

    }
}
