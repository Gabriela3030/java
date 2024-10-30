package ifood_exercicio.entidades;

import javafx.scene.chart.PieChart.Data;

public class historicodepagamento {
    
    private int id;
    private Data datadepagamento;
    private float valor;
    private formadepagamento formadepagamento;
    
    public historicodepagamento(int id, Data datadepagamento, float valor,
            ifood_exercicio.entidades.formadepagamento formadepagamento) {
        this.id = id;
        this.datadepagamento = datadepagamento;
        this.valor = valor;
        this.formadepagamento = formadepagamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Data getDatadepagamento() {
        return datadepagamento;
    }

    public void setDatadepagamento(Data datadepagamento) {
        this.datadepagamento = datadepagamento;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public formadepagamento getFormadepagamento() {
        return formadepagamento;
    }

    public void setFormadepagamento(formadepagamento formadepagamento) {
        this.formadepagamento = formadepagamento;
    }

    
}
