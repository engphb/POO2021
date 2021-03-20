public class Produto {
    private String nome;
    private Double preço;

    public Produto(String nome, Double preco) {
        this.setNome(nome);
        this.setPreço(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }
}
