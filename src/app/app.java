/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import dao.*;
import modelo.*;

/**
 *
 * @author CamilaTiemi
 */
public class app {
    //psvm + tab
    public static void main(String[] args){
        Pessoa joao= new Pessoa("Joao","Silva", 20);
        Pessoa maria= new Pessoa("Maria","Joaquina",34);
        Pessoa jose= new Pessoa("Jose","Joaquim",12);
    //sout + tab
        Dao dao= new PessoaDaoVetor(2);
        dao.adicionar(joao);
        dao.adicionar(maria);
        dao.adicionar(jose);
        
        dao.listarTudo();
        
        System.out.println("\n\n--- vamos remover");
        dao.remover(maria);
        dao.listarTudo();
    }
    
}
