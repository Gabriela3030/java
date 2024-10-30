package ifood_exercicio.entidades;

public class Endereço {
    
    private int id;
    private String name;
    private String rua;
    private String bairro;
    private String numero;
    private String cidade;
    private String estado;
    private String cep;
    private String tipo_de_endereco;
    
    public Endereço(int id, String name, String rua, String bairro, String numero, String cidade, String estado,
            String cep, String tipo_de_endereco) {
        this.id = id;
        this.name = name;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.tipo_de_endereco = tipo_de_endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTipo_de_endereco() {
        return tipo_de_endereco;
    }

    public void setTipo_de_endereco(String tipo_de_endereco) {
        this.tipo_de_endereco = tipo_de_endereco;
    }

}
