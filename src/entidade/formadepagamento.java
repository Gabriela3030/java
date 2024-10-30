package ifood_exercicio.entidades;

public class formadepagamento {
    
    private int id;
    private String formaDepagamento;
    
    public formadepagamento(int id, String formaDepagamento) {
        this.id = id;
        this.formaDepagamento = formaDepagamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFormaDepagamento() {
        return formaDepagamento;
    }

    public void setFormaDepagamento(String formaDepagamento) {
        this.formaDepagamento = formaDepagamento;
    }
    
}
