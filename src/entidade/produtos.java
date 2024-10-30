package ifood_exercicio.entidades;

public class produtos {
    
    private int id;
    private String nome;
    private categoria categoria;
    private restaurante restaurante;
    private float preco;
    
    public produtos(int id, String nome, ifood_exercicio.entidades.categoria categoria,
            ifood_exercicio.entidades.restaurante restaurante, float preco) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.restaurante = restaurante;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(categoria categoria) {
        this.categoria = categoria;
    }

    public restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    
}
