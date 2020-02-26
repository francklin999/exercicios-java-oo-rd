package exercicio03;

public class Produto{
    private int id;
    private String nome;
    private double preco;
    private double precoPromocao;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(int id, String nome, double preco, double precoPromocao) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.precoPromocao = precoPromocao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco= preco;
    }

    public double getPrecoPromocao() {
        return precoPromocao;
    }

    public void setprecoPromocao(double precoPromocao) {
        this.precoPromocao = precoPromocao;
    }
}

