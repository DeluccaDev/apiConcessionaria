package main.java.org.entities;

public class Carro {

    //---===Atributos de um veiculo===---//
    private String placa;
    private Short ano;
    private String marca;
    private String modelo;
    private String cor;
    private Double preco;
    private Boolean vendido;

    //---===Contrutor===---//
    public Carro () {}

    public Carro(String placa, Short ano, String marca, String modelo, String cor, Double preco, Boolean vendido) {
        this.placa = placa;
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
        this.vendido = vendido;
    }

    //---===Getters and Setters===---//
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Short getAno() {
        return ano;
    }

    public void setAno(Short ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Boolean getVendido() {
        return vendido;
    }

    public void setVendido(Boolean vendido) {
        this.vendido = vendido;
    }
}
