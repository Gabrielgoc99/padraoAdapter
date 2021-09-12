

public class Produto {

    IPagamento pagamento;
    PagamentoAdapter persistencia;

    public Produto() {
        pagamento = new PagamentoCartao();
        persistencia = new PagamentoAdapter(pagamento);
    }

    public void setPagamento(String cartaoCredito) {
        pagamento.setPagamento(cartaoCredito);
        persistencia.salvarPagamento();
    }

    public String getPagamento() {
        return persistencia.recuperarPagamento();
    }

}