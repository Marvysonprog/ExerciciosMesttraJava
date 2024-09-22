/******************************************************************************
Exercício 01: Faça um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a média alcançada por aluno e apresentar:


A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;

A mensagem "Reprovado", se a média for menor do que sete;

A mensagem "Aprovado com Distinção", se a média for igual a dez.

*******************************************************************************/
import java.util.Scanner;


public class MediaDeAlunos
{
public static void main(String[] args) {
   
   Scanner teclado = new Scanner(System.in);
   
   float nota1, nota2, media;
   
   
System.out.print("Digite a primeira nota: ");
nota1 = teclado.nextFloat();
System.out.print("Digite a segunda nota: ");
nota2 = teclado.nextFloat();

media = (nota1 + nota2) / 2;

if(media >= 7){
   System.out.print("APROVADO!");
}

if(media == 10){
   System.out.print("APROVADO COM DISTINÇÃO!");
}
if (media < 7){
   System.out.print("REPROVADO!");
   
}
}
   
}