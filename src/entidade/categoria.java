package ifood_exercicio.entidades;

public class categoria {
    private int id;
    private String nome;
    private String descricao;
    private String tipo_categoria;
    
    public categoria(int id, String nome, String descricao, String tipo_categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.tipo_categoria = tipo_categoria;
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

    public String getTipo_categoria() {
        return tipo_categoria;
    }

    public void setTipo_categoria(String tipo_categoria) {
        this.tipo_categoria = tipo_categoria;
    }
    
}
