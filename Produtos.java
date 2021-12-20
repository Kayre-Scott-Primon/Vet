/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vet;

/**
 *
 * @author kayro
 */
public class Produtos {
    
    public String nome;
    public int quant;
    public double preco;
    public String codigo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produtos(String nome, int quant, double preco, String codigo) {
        this.nome = nome;
        this.quant = quant;
        this.preco = preco;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Produtos{" + "nome=" + nome + ", quant=" + quant + ", preco=" + preco + ", codigo = " + codigo+'}';
    }
    
    
    
    
    
}
