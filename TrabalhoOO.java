/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhooo;

import java.util.ArrayList;

/**
 *
 * @author miche
 */
public class TrabalhoOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Filmes Locadora = new Filmes();
        ArrayList<String> manda = new ArrayList<String>();
        manda.add("Tarzan");
        manda.add("Hercules");
        Locadora.setFilmesAlugados(manda);
        Controle a = new Controle();
        a.cadastrarFilme("Barbie");
        Locadora.imprimirFilmes();
        System.out.println(Locadora.getQuantFilmes());
    }
    
}
