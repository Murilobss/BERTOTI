public class TesteRestaurante {
    public static void main(String[] args) {
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
