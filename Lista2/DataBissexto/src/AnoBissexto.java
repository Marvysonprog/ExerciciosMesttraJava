import java.util.Scanner;


public class AnoBissexto {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int dia, mes, ano;
        boolean anoNaoEhBissexto;

        

        System.out.print("Digite o dia do mes: ");
        dia = teclado.nextInt();
        
        System.out.print("Digite o mes do ano: ");
        mes = teclado.nextInt();
        
        System.out.print("Digite o ano: ");
        ano = teclado.nextInt();

        anoNaoEhBissexto = ((ano % 4) != 0);
        

        if (dia == 29 && mes == 2 && anoNaoEhBissexto ) {
            System.out.println("A data é Invalida pois o ano não é bissexto ");       
        } else if( dia > 31) { 
            System.out.println("A data é Invalida pois não existe dia maior que 31. ");
        } else if (dia == 31 && (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11)){ 
            System.out.println("A data é Invalida pois não existe 31 no mes  " + mes);
        } else if (dia == 30 && mes == 2) {
            System.out.println("A data é Invalida pois não existe o dia 30 de fevereiro ");
        } else if (mes > 12) {
            System.out.println("A data é Invalidam pois os meses deve ser entre 1 e 12");
        } else { 
            System.out.println("A data é Válida! ");
        }

        teclado.close();
    }
}
