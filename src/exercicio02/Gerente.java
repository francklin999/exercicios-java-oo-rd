package exercicio02;

public class Gerente extends Funcionario {
 private double bonusAnualVariavel;
    public Gerente(Funcionario nome, Funcionario salarioMensal,double bonusAnualVariavel) {
        super(nome, salarioMensal);
    this.bonusAnualVariavel = bonusAnualVariavel;
    }

    public double getBonusAnualVariavel() {
        return bonusAnualVariavel;
    }

    public void setBonusAnualVariavel(double bonusAnualVariavel) {
        this.bonusAnualVariavel = bonusAnualVariavel;
    }

    public double porcentagemBonus(){

        return bonusAnualVariavel / (salarioAnual()/13);
    }

    @Override
    public double salarioAnual() {

        return  salarioAnual() * porcentagemBonus();
    }
}
