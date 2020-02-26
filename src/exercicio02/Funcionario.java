package exercicio02;

public abstract class Funcionario {
    private String nome;
    private double salarioMensal;

    public Funcionario(Funcionario nome,Funcionario salarioMensal) {
    }

    public abstract double salarioAnual();
}
