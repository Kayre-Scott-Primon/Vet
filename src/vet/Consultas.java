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
public class Consultas {
    
    public String nome,data,hora;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Consultas(String nome,String data, String hora) {
        this.nome = nome;
        this.data = data;
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "nome="+ nome +"\n data=" + data + "\n hora=" + hora + "\n\n";
    }
    
    
}
