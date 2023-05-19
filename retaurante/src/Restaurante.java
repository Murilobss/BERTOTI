public class Restaurante {
    public static void main(String[] args) {
        class MateriaPrima {
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

        class Funcionario {
            private String nome;
            private String cargo;
            private double salario;

            public Funcionario(String nome, String cargo, double salario) {
                this.nome = nome;
                this.cargo = cargo;
                this.salario = salario;
            }

            public String getNome() {
                return nome;
            }

            public void setNome(String nome) {
                this.nome = nome;
            }

            public String getCargo() {
                return cargo;
            }

            public void setCargo(String cargo) {
                this.cargo = cargo;
            }

            public double getSalario() {
                return salario;
            }

            public void setSalario(double salario) {
                this.salario = salario;
            }
        }

        MateriaPrima tomate = new MateriaPrima("Tomate", 10, "Fornecedor A");
        MateriaPrima cebola = new MateriaPrima("Cebola", 5, "Fornecedor B");

        Funcionario cozinheiro = new Funcionario("João", "Cozinheiro", 2000.0);
        Funcionario garcom = new Funcionario("Maria", "Garçom", 1500.0);

        System.out.println("Matéria-prima: " + tomate.getNome() + ", Quantidade: " + tomate.getQuantidade() + ", Fornecedor: " + tomate.getFornecedor());
        System.out.println("Matéria-prima: " + cebola.getNome() + ", Quantidade: " + cebola.getQuantidade() + ", Fornecedor: " + cebola.getFornecedor());
        System.out.println("Funcionário: " + cozinheiro.getNome() + ", Cargo: " + cozinheiro.getCargo() + ", Salário: " + cozinheiro.getSalario());
        System.out.println("Funcionário: " + garcom.getNome() + ", Cargo: " + garcom.getCargo() + ", Salário: " + garcom.getSalario());
    }
}