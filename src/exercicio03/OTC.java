package exercicio03;

public class OTC extends Produto{
    private double precoPromo;

    public OTC(int id, String nome, double precoVenda, double descontoSite, double precoPromo) {
        super(id, nome, precoVenda, descontoSite);
        this.precoPromo = precoPromo;
    }

    public double getPrecoPromo() {
        return precoPromo;
    }

    public void setPrecoPromo(double precoPromo) {
        this.precoPromo = precoPromo;
    }
}