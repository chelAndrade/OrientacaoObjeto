/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhooo;

/**
 *
 * @author miche
 */
public class Controle {
    Filmes filme = new Filmes();
    public void cadastrarFilme(String filme){
        this.filme.addFilme(filme);
    }
}
