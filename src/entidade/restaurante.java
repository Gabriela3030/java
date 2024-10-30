package ifood_exercicio.entidades;

import java.sql.Date;

public class restaurante {
    
    private int id;
    private String nome;
    private String telefone;
    private Date hora_funcionamento;
    private boolean retirada;
    private categoria categoria;
    private float valorMinimoEntrega;
    
    public restaurante(int id, String nome, String telefone, Date hora_funcionamento, boolean retirada,
            ifood_exercicio.entidades.categoria categoria, float valorMinimoEntrega) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.hora_funcionamento = hora_funcionamento;
        this.retirada = retirada;
        this.categoria = categoria;
        this.valorMinimoEntrega = valorMinimoEntrega;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getHora_funcionamento() {
        return hora_funcionamento;
    }

    public void setHora_funcionamento(Date hora_funcionamento) {
        this.hora_funcionamento = hora_funcionamento;
    }

    public boolean isRetirada() {
        return retirada;
    }

    public void setRetirada(boolean retirada) {
        this.retirada = retirada;
    }

    public categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(categoria categoria) {
        this.categoria = categoria;
    }

    public float getValorMinimoEntrega() {
        return valorMinimoEntrega;
    }

    public void setValorMinimoEntrega(float valorMinimoEntrega) {
        this.valorMinimoEntrega = valorMinimoEntrega;
    }

    
}
