/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.*;

/**
 *
 * @author CamilaTiemi
 */
public interface Dao {
    public void adicionar(Pessoa p);
    public void remover(Pessoa p);
    public void listarTudo();
}
