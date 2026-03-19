public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome) {
        this.nome = nome;
        this.preco = 0.0;
    }   

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }   
}