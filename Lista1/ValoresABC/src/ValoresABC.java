import java.util.Scanner;

public class ValoresABC
{
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero1, numero2, numero3, soma;
        
        System.out.println("Digite o primeiro valor: ");
        numero1 = teclado.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        numero2 = teclado.nextInt();
        
        System.out.println("Digite o terceiro valor: ");
        numero3 = teclado.nextInt();
        
        soma = (numero1 + numero2);
        
        if (soma < numero3){
            System.out.print("A soma do primeiro e segundo valor é menor que o terceiro valor. ");            
        } else {
            System.out.println("A soma do primeiro e segundo valor é maior que o terceiro valor. ");    
       }
       teclado.close();
	}
}