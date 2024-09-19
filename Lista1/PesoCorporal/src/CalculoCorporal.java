import java.util.Scanner;

public class CalculoCorporal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double altura;
        String sexo;
        double pesoIdeal;

        System.out.print("Digite sua Altura: ");
        altura = teclado.nextDouble();

        System.out.print("Digite seu sexo: F ou M: ");
        teclado.nextLine();
        sexo = teclado.next();

        if (sexo.equals("m")) {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("Seu peso ideal é %.1f", pesoIdeal);
        } else if (sexo.equals("f")) {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal é %.1f", pesoIdeal);
        } else {
            System.out.println("Resposta Invalida");
        }

    }
}
