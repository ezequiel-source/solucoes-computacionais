package Prova;

import javax.swing.JOptionPane;

public class Produto {
    // atributos
    private String nome;
    private String descricao;
    private double preco;

    // métodos
    private double aumentarPreco;

    // construtor
    public Produto() {
        this.nome = JOptionPane.showInputDialog("Insira o nome do produto: ");
        this.descricao = JOptionPane.showInputDialog("Insira a descrição do produto: ");
        this.preco = Double.parseDouble(JOptionPane.showInputDialog("Insira um preço para o produto: "));
        this.aumentarPreco = preco * 0.02;
    }

    public Produto(String nome, String descricao, double preco, double aumentarPreco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.aumentarPreco = preco * 0.02;
    }

    // getters & setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setAumentarPreco(double aumentarPreco) {
        this.aumentarPreco = aumentarPreco;
    }

    public double getAumentarPreco() {
        return aumentarPreco;
    }
}
