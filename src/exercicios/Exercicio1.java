package exercicios;
 /* 1.	Escreva um algoritmo em Java que leia uma sequência de números do usuário,
 realize a soma desses números e encerre a execução quando um número negativo for digitado.*/

import util.Scan;

public class Exercicio1 implements Scan {
    public static void main(String[] args) {
        double num1, num2, soma;

        do {
            System.out.print("Digite o primeiro número: ");
            num1 = sc.nextDouble();

            System.out.print("Digite o segundo número: ");
            num2 = sc.nextDouble();

            if (num1 >= 0 && num2 >= 0) {
                soma = num1 + num2;
                System.out.println("A soma dos números é: " + soma);
            } else {
                System.out.println("Função encerrada!");
            }

        } while (num1 >= 0 && num2 >= 0);
    }
}
