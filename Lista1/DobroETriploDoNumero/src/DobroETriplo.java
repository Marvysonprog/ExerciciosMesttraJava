import java.util.Scanner;

public class DobroETriplo {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int numero, resultado; 

        System.out.print("Digite um numero: ");
        numero = teclado.nextInt();

        if(numero >= 0 ){
            resultado = numero * 2;
            System.out.println("O numero digitado " + numero + " e o dobro dele é " + resultado);
        }else {
            resultado = numero * 3;
            System.out.println("O numero digitado foi negativo e o seu triplo é " + resultado);
        }
        teclado.close();
    }
}
