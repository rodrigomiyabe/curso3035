package exercicios;

import util.Scan;

public class Exercicio4 implements Scan {

    public static void main(String[] args) {
        Integer atk, def, evol;
        Double calculaPoder;

        System.out.println("Digite o nivel de ataque do personagem");
        atk = sc.nextInt();
        while (atk > 0 && atk > 10) {
            System.out.println("Ataque inválido! Digite outro valor.");
            atk = sc.nextInt();
        }

        System.out.println("Digite o nivel de defesa do personagem");
        def = sc.nextInt();
        while (def > 0 && def > 10) {
            System.out.println("Ataque inválido! Digite outro valor.");
            def = sc.nextInt();
        }

        System.out.println("Digite o nivel de capacidade de evolução do personagem");
        evol = sc.nextInt();
        while (evol > 0 && evol > 10) {
            System.out.println("Ataque inválido! Digite outro valor.");
            evol = sc.nextInt();
        }
        calculaPoder = (atk * 0.45) + (def * 0.35) + (evol * 0.2);

        if (calculaPoder > 8.0) {
            System.out.println("Personagem especial: Poder " + calculaPoder);
        } else {
            System.out.println(calculaPoder);
        }


    }
}
