/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import modelo.Pessoa;

/**
 *
 * @author CamilaTiemi
 */
public class PessoaDaoArrayList implements Dao{

    private ArrayList<Pessoa> lista;
    
    public PessoaDaoArrayList(){
        lista= new ArrayList<>();
    }
  
    
    @Override
    public void adicionar(Pessoa p) {
        lista.add(p);
        System.out.println("A pesssoa\"" + p.getNome() + "\"Foi adicionada");
    }

    @Override
    public void remover(Pessoa p) {
        lista.remove(p);
        System.out.println("A pesssoa\"" + p.getNome() + "\"Foi removida");
       
    }

    @Override
    public void listarTudo() {
        //temos que percorrer o ArrayList de sua posição inicial até a final, mas qual a final ? temos um topo?
        //vamos usar um for-each para resolver este problema
        System.out.println("Inicio da relaçao::");
       for (Pessoa elementoDaLista : lista){
           System.out.println(elementoDaLista);
        System.out.println(":fim da relaçao");
       }
    }
    
}
