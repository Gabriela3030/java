package ifood_exercicio.entidades;

public class produtoacompanhamento {
    
    private int id;
    private produtos produto;
    private acompanhamento acompanhamento;
    
    public produtoacompanhamento(int id, produtos produto, ifood_exercicio.entidades.acompanhamento acompanhamento) {
        this.id = id;
        this.produto = produto;
        this.acompanhamento = acompanhamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public produtos getProduto() {
        return produto;
    }

    public void setProduto(produtos produto) {
        this.produto = produto;
    }

    public acompanhamento getAcompanhamento() {
        return acompanhamento;
    }

    public void setAcompanhamento(acompanhamento acompanhamento) {
        this.acompanhamento = acompanhamento;
    }



    
}
