import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProdutoTest {

    @Test
    void deveRetornarPagamentoCartao() {
        Produto produto = new Produto();
        produto.setPagamento("5 Creditos!");

        assertEquals("5 Creditos!", produto.getPagamento());
    }

    @Test
    void deveRetornarPagamentoDinheiro() {
        Produto produto = new Produto();
        produto.setPagamento("10 Creditos!");

        assertEquals(2.0f, produto.persistencia.getDinheiro());
    }

}