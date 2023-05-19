import org.junit.Test;
import static org.junit.Assert.*;

public class RestauranteTest {

    @Test
    public void testGetNomeMateriaPrima() {
        Restaurante.MateriaPrima tomate = new Restaurante.MateriaPrima("Tomate", 10, "Fornecedor A");

        assertEquals("Tomate", tomate.getNome());
    }

    public static class Restaurante {
        public static class MateriaPrima {
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

            public int getQuantidade() {
                return quantidade;
            }

            public String getFornecedor() {
                return fornecedor;
            }
        }
    }
}
