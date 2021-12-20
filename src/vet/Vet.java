/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author kayro
 */
public class Vet {

    static Dialogo dial = new Dialogo();
    static Consulta consul = new Consulta();
    static Venda vend = new Venda();
    static Vendas vends = new Vendas();
    static CadastroProdut CdP = new CadastroProdut();
    static Cadastro cadas = new Cadastro();
    static MarcarColsulta mc = new MarcarColsulta();
    static Produtos prod = new Produtos(null,0,0,null);
    static AtualizarP ap = new AtualizarP();

    static ArrayList<Animal> animal = new ArrayList();
    static ArrayList<Produtos> produto = new ArrayList();
    static ArrayList<Consultas> consultas = new ArrayList();

    public static void importarArqA() throws FileNotFoundException, IOException {

        Scanner entrada = new Scanner(new File("C:\\Users\\kayro\\OneDrive\\Desktop\\vet\\ani.txt"));
        while (entrada.hasNext()) {

            try {

                String linha = (entrada.nextLine());
                String[] vetor = linha.split(";");

                StringBuilder sb = new StringBuilder();

                for (String vetor1 : vetor) {
                    //vetor[i] = Arrays.toString(entrada.nextLine().split(";"));
                    sb.append(vetor1);
                }

                String recup = String.valueOf(sb);

                String nome = vetor[0];
                String especie = vetor[1];
                String raca = vetor[2];
                String sexo = vetor[3];
                String cor = vetor[4];
                String porte = vetor[5];
                String peso = vetor[6];
                String idade = vetor[7];

                //String[] gold= entrada.nextLine().split(";");
                Animal an = new Animal(nome, especie, raca, sexo, cor, porte, Integer.parseInt(peso), Integer.parseInt(idade));

                animal.add(an);

                System.out.println(an);

            } catch (NoSuchElementException e) {

                entrada.close();
                System.exit(1);

                JOptionPane.showMessageDialog(null, e);

            }

        }

    }

    public static void exportarArqA(Animal an) throws IOException {

        try {

            File arquivo = new File("C:\\Users\\kayro\\OneDrive\\Desktop\\vet\\ani.txt");
            arquivo.createNewFile();
            FileWriter fileWriter = new FileWriter(arquivo, true); // true ou false para manter ou sobreescrever 
            //codigo para salvar arquivo
            try (PrintWriter writer = new PrintWriter(fileWriter) //writer.println("5858585858");
                    ) {
                //codigo para salvar arquivo
                writer.println(an.getNome() + ";" + an.getEspecie() + ";" + an.getRaca() + ";" + an.getSexo() + ";" + an.getCor() + ";" + an.getPorte() + ";" + an.getPeso() + ";" + an.getIdade());

                // writer.println("\n");
                writer.flush();
            }

        } catch (IOException e) {

            System.out.println(e);

        }

    }

    public static Produtos pesquisarP(String cod) {

        for (int i = 0; i < produto.size(); i++) {

            if (cod.equals(produto.get(i).getCodigo())) {
                return produto.get(i);

            
            }

        }
        return null;
    }

    public static void importarArqP() throws FileNotFoundException, IOException {

        Scanner entrada = new Scanner(new File("C:\\Users\\kayro\\OneDrive\\Desktop\\vet\\pro.txt"));
        while (entrada.hasNext()) {

            try {

                String linha = (entrada.nextLine());
                String[] vetor = linha.split(";");
                System.out.println(linha);
                StringBuilder sb = new StringBuilder();

                for (String vetor1 : vetor) {
                    //vetor[i] = Arrays.toString(entrada.nextLine().split(";"));
                    sb.append(vetor1);
                }

                String recup = String.valueOf(sb);

                String nome = vetor[0];
                String quant = vetor[1];
                String preco = vetor[2];
                String codigo = vetor[3];

                //String[] gold= entrada.nextLine().split(";");
                Produtos p = new Produtos(nome, Integer.parseInt(quant), Double.parseDouble(preco), codigo);
                System.out.println(p);
                produto.add(p);
                
                System.out.println(produto);

                System.out.println(p);

            } catch (NoSuchElementException e) {

                entrada.close();
                System.exit(1);

                JOptionPane.showMessageDialog(null, e);

            }

        }

    }

    public static void exportarArqP(Produtos p) throws IOException {

        try {

            File arquivo = new File("C:\\Users\\kayro\\OneDrive\\Desktop\\vet\\pro.txt");
            arquivo.createNewFile();
            FileWriter fileWriter = new FileWriter(arquivo, true); // true ou false para manter ou sobreescrever 
            //codigo para salvar arquivo
            try (PrintWriter writer = new PrintWriter(fileWriter) //writer.println("5858585858");
                    ) {
                //codigo para salvar arquivo
                writer.println(p.getNome() + ";" + p.getQuant() + ";" + p.getPreco() + ";" + p.getCodigo());

                writer.flush();
                writer.close();
            }

        } catch (IOException e) {

            System.out.println(e);

        }

    }

    public static Animal pesquisarA(String pesq) {

        for (int i = 0; i < animal.size(); i++) {

            if (pesq.equals(animal.get(i).getNome()) || pesq.equals(animal.get(i).getEspecie()) || pesq.equals(animal.get(i).getCor()) || pesq.equals(animal.get(i).getIdade()) || pesq.equals(animal.get(i).getPeso()) || pesq.equals(animal.get(i).getPorte()) || pesq.equals(animal.get(i).getSexo())) {
                return animal.get(i);

            } else {
                return null;
            }

        }
        return null;
    }

    public static void importarArqC() throws FileNotFoundException, IOException {

        Scanner entrada = new Scanner(new File("C:\\Users\\kayro\\OneDrive\\Desktop\\vet\\consul.txt"));
        while (entrada.hasNext()) {

            try {

                String linha = (entrada.nextLine());
                String[] vetor = linha.split(";");

                StringBuilder sb = new StringBuilder();

                for (String vetor1 : vetor) {
                    //vetor[i] = Arrays.toString(entrada.nextLine().split(";"));
                    sb.append(vetor1);
                }

                String recup = String.valueOf(sb);

                String nome = vetor[0];
                String data = vetor[1];
                String hora = vetor[2];

                Consultas c = new Consultas(nome, data, hora);

                consultas.add(c);

                System.out.println(c);

            } catch (NoSuchElementException e) {

                entrada.close();
                System.exit(1);

                JOptionPane.showMessageDialog(null, e);

            }

        }

    }

    public static void exportarArqC(Consultas c) throws IOException {

        try {

            File arquivo = new File("C:\\Users\\kayro\\OneDrive\\Desktop\\vet\\Consul.txt");
            arquivo.createNewFile();
            FileWriter fileWriter = new FileWriter(arquivo, true); // true ou false para manter ou sobreescrever 
            //codigo para salvar arquivo
            try (PrintWriter writer = new PrintWriter(fileWriter) //writer.println("5858585858");
                    ) {
                //codigo para salvar arquivo
                writer.println(c.getNome() + ";" + c.getData() + ";" + c.getHora());

                // writer.println("\n");
                writer.flush();
            }

        } catch (IOException e) {

            System.out.println(e);

        }

    }

    public static Consultas pesquisarC(String data, String hora) {

        for (int i = 0; i < consultas.size(); i++) {

            if (data.equals(consultas.get(i).getData()) && hora.equals(consultas.get(i).getHora())) {
                return consultas.get(i);

            } else {
                return null;
            }

        }
        return null;
    }

    public static void editarAni(Animal animal, String nome, String especie, String raca, String sexo, String cor, String porte, int peso, int idade) {

        animal.setNome(nome);
        animal.setEspecie(especie);
        animal.setRaca(raca);
        animal.setSexo(sexo);
        animal.setCor(cor);
        animal.setPorte(porte);
        animal.setPeso(peso);
        animal.setIdade(idade);
    }

    public static void main(String[] args) throws IOException {

        Animal a = new Animal(null, null, null, null, null, null, 0, 0);

        Vet.dial.setVisible(true);

        importarArqA();
        importarArqP();
        importarArqC();

    }

}
