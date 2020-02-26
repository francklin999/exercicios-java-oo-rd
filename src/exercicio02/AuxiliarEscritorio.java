package exercicio02;

public class AuxiliarEscritorio extends Funcionario {
    private double bonusAnual;

    public AuxiliarEscritorio(Funcionario nome,Funcionario salarioMensal, double bonusAnual) {
        super(salarioMensal,nome);
        this.bonusAnual = bonusAnual;
    }

    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    @Override
    public double salarioAnual() {

        return  salarioAnual() + bonusAnual;
    }
}

