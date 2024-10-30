package ifood_exercicio.entidades;

public class restaurantepagamento {
    
    private int id;
    private formadepagamento formadepagamento;
    private restaurante restaurante;
    
    public restaurantepagamento(int id, ifood_exercicio.entidades.formadepagamento formadepagamento,
            ifood_exercicio.entidades.restaurante restaurante) {
        this.id = id;
        this.formadepagamento = formadepagamento;
        this.restaurante = restaurante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public formadepagamento getFormadepagamento() {
        return formadepagamento;
    }

    public void setFormadepagamento(formadepagamento formadepagamento) {
        this.formadepagamento = formadepagamento;
    }

    public restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(restaurante restaurante) {
        this.restaurante = restaurante;
    }

    
}
