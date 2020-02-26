package exercicio02;

public class TecnicoManutencao extends Funcionario{
    private double insalubridade;
    private double bonusFixo;

    public TecnicoManutencao(Funcionario nome, Funcionario salarioMensal, double insalubridade, double bonusFixo) {
        super(nome, salarioMensal);
        this.insalubridade = insalubridade;
        this.bonusFixo = bonusFixo;
    }

    public double getInsalubridade() {
        return insalubridade;
    }

    public void setInsalubridade(double insalubridade) {
        this.insalubridade = insalubridade;
    }

    public double getBonusFixo() {
        return bonusFixo;
    }

    public void setBonusFixo(double bonusFixo) {
        this.bonusFixo = bonusFixo;
    }


    @Override
    public double salarioAnual() {

    return  salarioAnual() + bonusFixo + (insalubridade * (salarioAnual()/13));
    }
}
