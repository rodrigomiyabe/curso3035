package exercicios;

import util.Scan;

public class Exercicio3 implements Scan {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        System.out.println("Digite o nome");
        pessoa.setNome(sc.next());
        System.out.println("Digite a idade");
        pessoa.setIdade(sc.nextInt());
        System.out.println("Digite a altura (utilizando ,)");
        pessoa.setAltura(sc.nextDouble());
        System.out.println("Digite o peso");
        pessoa.setPeso(sc.nextDouble());

        System.out.println(pessoa);
    }
}

