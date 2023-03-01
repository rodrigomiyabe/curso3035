package exercicios;

import util.Scan;

public class Exercicio2 implements Scan {
    public static void main(String[] args) {
        Integer numTotalEleitores, votosBrancos, nulos, validos;

        double calculoBrancos, calculoNulos, calculoValido;

        System.out.println("Digite o valor total de eleitores");
        numTotalEleitores = sc.nextInt();

        System.out.println("Digite o valor total de votos em branco");
        votosBrancos = sc.nextInt();

        System.out.println("Digite o valor total de votos nulos");
        nulos = sc.nextInt();

        System.out.println("Digite o valor total de votos validos");
        validos = sc.nextInt();

        calculoBrancos = (votosBrancos / numTotalEleitores) * 100;
        calculoNulos = (nulos / numTotalEleitores) * 100;
        calculoValido = (validos / numTotalEleitores) * 100;

        System.out.println("Porcentagem de votos em branco: " + calculoBrancos + "%");
        System.out.println("Porcentagem de votos nulos: " + calculoNulos + "%");
        System.out.println("Porcentagem de votos em válidos: " + calculoValido + "%");
    }
}
