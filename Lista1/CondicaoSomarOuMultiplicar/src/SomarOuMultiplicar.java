import java.util.Scanner;

public class SomarOuMultiplicar {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int numero1, numero2, soma; 

        System.out.print("Digite o primeiro numero: ");
        numero1 = teclado.nextInt();

        System.out.print("Digite o segundo numero: ");
        numero2 = teclado.nextInt();

        if(numero1 == numero2){
            soma = numero1 + numero2;
            System.out.println("Os valores foram somados e o resultado é: " + soma);
        } else {
            soma = numero1 * numero2;
            System.out.println("Os valores foram multiplicados e o resultado é: " + soma);
        }
        teclado.close();
    }
}
