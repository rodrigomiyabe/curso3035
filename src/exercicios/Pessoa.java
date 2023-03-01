package exercicios;

public class Pessoa {

    private String nome;
    private Integer idade;
    private double altura;
    private Double peso;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }


    public Pessoa(String nome, Integer idade, Double altura, Double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public Pessoa(){}

    public String calculaIMC() {
        double imc;
        imc = this.peso / Math.pow(this.altura, 2);

        if (imc < 18.5) {
            return "Abaixo do peso normal";
        } else if (imc > 18.5 && imc <= 24.9) {
            return "Peso normal";
        } else if (imc > 25.0 && imc <= 29.9) {
            return "Excesso de peso";
        } else if (imc > 30.0 && imc <= 34.9) {
            return "Obesidade classe I";
        } else if (imc > 35.0 && imc <= 39.9) {
            return "Obesidade classe II";
        } else
            return "Obesidade classe III";
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                ", peso=" + peso +
                ", IMC= " + calculaIMC() +
                '}';
    }
}

