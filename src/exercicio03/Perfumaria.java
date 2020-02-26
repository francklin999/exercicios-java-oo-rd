package exercicio03;

//Os produtos do tipo Perfumaria também possuem um preço promocional definido no cadastro e, além disso, dados referentes a qtde e preço do produto na modalidade LMPM (Leve Mais, Pague Menos)
public class Perfumaria extends Produto{
    private double precoPromo;

    public Perfumaria(int id, String nome, double precoVenda, double descontoSite, double precoPromo) {
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