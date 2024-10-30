package ifood_exercicio.entidades;

import javafx.scene.chart.PieChart.Data;

public class promocao {
    
    private int id;
    private String nome;
    private String codigo;
    private float valor;
    private Data validade;
    private String tipo;
    
    public promocao(int id, String nome, String codigo, float valor, Data validade, String tipo) {
        this.id = id;
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
        this.validade = validade;
        this.tipo = tipo;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Data getValidade() {
        return validade;
    }

    public void setValidade(Data validade) {
        this.validade = validade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}
