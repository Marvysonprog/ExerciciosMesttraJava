import java.util.Scanner;


public class DescontandoMinutos {
    public static void main(String[] args) throws Exception {
       Scanner teclado = new Scanner(System.in);
       
        int minutoInicial, horaInicial, horaFinal, minutoFinal, totalMinutos;
        int minutosDescontar = 0;

       System.out.println("Digite a hora inicial");
        horaInicial = teclado.nextInt();
        System.out.println("Digite o minuto inicial");
        minutoInicial = teclado.nextInt();
       System.out.println("Digite a hora final");
        horaFinal = teclado.nextInt();
       System.out.println("Digite o minuto final");
        minutoFinal = teclado.nextInt();
       System.out.println("Digite o total de minutos");
        totalMinutos = teclado.nextInt();

        if(horaInicial < 19){
            minutosDescontar += 60 - minutoInicial;
        }
        if( horaFinal >= 20){
            minutosDescontar += minutoFinal;

            System.out.println("Minutos considerados: " + (totalMinutos - minutosDescontar));
        }
        teclado.close();
    }
}
