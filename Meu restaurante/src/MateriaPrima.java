public class MateriaPrima {
    private String nome;
    private int quantidade;
    private String fornecedor;

    public MateriaPrima(String nome, int quantidade, String fornecedor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
}
