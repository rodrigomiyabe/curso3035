package exercicios;

import util.Scan;

public class Exercicio4 implements Scan {

    public static void main(String[] args) {
        Integer ataque, defesa, evolucao;
        Double calculaPoder;

        System.out.println("Digite o nivel de ataque do personagem");
        ataque = sc.nextInt();
        while (ataque > 0 && ataque > 10) {
            System.out.println("Ataque inválido! Digite outro valor.");
            ataque = sc.nextInt();
        }

        System.out.println("Digite o nivel de defesa do personagem");
        defesa = sc.nextInt();
        while (defesa > 0 && defesa > 10) {
            System.out.println("Ataque inválido! Digite outro valor.");
            defesa = sc.nextInt();
        }

        System.out.println("Digite o nivel de capacidade de evolução do personagem");
        evolucao = sc.nextInt();
        while (evolucao > 0 && evolucao > 10) {
            System.out.println("Ataque inválido! Digite outro valor.");
            evolucao = sc.nextInt();
        }
        calculaPoder = (ataque * 0.45) + (defesa * 0.35) + (evolucao * 0.2);

        if (calculaPoder > 8.0) {
            System.out.println("Personagem especial: Poder " + calculaPoder);
        } else {
            System.out.println(calculaPoder);
        }


    }
}
