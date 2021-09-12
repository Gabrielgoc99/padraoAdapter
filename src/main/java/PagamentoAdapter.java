

public class PagamentoAdapter extends PagamentoDinheiro {

    private IPagamento pagamentoCartao;

    public PagamentoAdapter(IPagamento pagamentoCartao) {
        this.pagamentoCartao = pagamentoCartao;
    }

    public String recuperarPagamento() {
        if (this.getDinheiro() >= 1.0f)
            pagamentoCartao.setPagamento("5 Creditos!");
        else
            if(this.getDinheiro() >= 2.0f)
            pagamentoCartao.setPagamento("10 Creditos!");

        else
            pagamentoCartao.setPagamento("0 Creditos!");
        return pagamentoCartao.getPagamento();


    }

        public void salvarPagamento() {
            if (pagamentoCartao.getPagamento().equals("5 Creditos!"))
                this.setDinheiro(1.0f);
            else
                if (pagamentoCartao.getPagamento().equals("10 Creditos!"))
                this.setDinheiro(2.0f);
            else
                this.setDinheiro(0.0f);
        }
}
