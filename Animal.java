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
public class Animal {
    
    public String nome,especie,raca,sexo,cor,porte;
    public int peso,idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + ", especie=" + especie + ", raca=" + raca + ", sexo=" + sexo + ", cor=" + cor + ", porte=" + porte + ", peso=" + peso + ", idade=" + idade + '}';
    }

    public Animal(String nome, String especie, String raca, String sexo, String cor, String porte, int peso, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.sexo = sexo;
        this.cor = cor;
        this.porte = porte;
        this.peso = peso;
        this.idade = idade;
    }
    
    
    
}
