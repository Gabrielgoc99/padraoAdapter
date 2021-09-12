

public class PagamentoCartao implements IPagamento {

    private String cartao;

    @Override
    public String getPagamento() {
        return this.cartao;
    }

    @Override
    public void setPagamento(String cartao) {
        this.cartao = cartao;
    }
}