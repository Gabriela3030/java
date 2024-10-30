package ifood_exercicio.entidades;

public class acompanhamento {
    
    private int id;
    private String nome;
    private String descricao;
    private float valo;
    
    public acompanhamento(int id, String nome, String descricao, float valo) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valo = valo;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValo() {
        return valo;
    }

    public void setValo(float valo) {
        this.valo = valo;
    }

    
}
