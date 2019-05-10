/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhooo;

import java.util.ArrayList;

/**
 *
 * @author michel,Christian o foda
 */
public class Filmes {
    // Titulo do filme
    private String tituloFilme;
    // Ano de lançamento do filme
    private boolean lancamento;
    // Genero do filme
    private String genero;
    // Quantidade de filmes disponiveis
    private static int quantFilmes = 2;
   
    // Relação completa de filmes
    private static ArrayList<String> filmes = new ArrayList();
    // Relação de filmes disponiveis
    private static ArrayList<String> filmesDisponiveis = new ArrayList();
    // Relação de filmes alugados
    private ArrayList<String> filmesAlugados = new ArrayList();
    // Relação de filmes que precisam de ser repostos
    private ArrayList<String> filmesParaRepor = new ArrayList();

    /**
     * @return the tituloFilme
     */
    public String getTituloFilme() {
        return tituloFilme;
    }

    /**
     * @param tituloFilme the tituloFilme to set
     */
    public void setTituloFilme(String tituloFilme) {
        this.tituloFilme = tituloFilme;
    }

    /**
     * @return the lancamento
     */
    public boolean isLancamento() {
        return lancamento;
    }

    /**
     * @param lancamento the lancamento to set
     */
    public void setLancamento(boolean lancamento) {
        this.lancamento = lancamento;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the quantFilmes
     */
    public int getQuantFilmes() {
        return quantFilmes;
    }

    /**
     * @param quantFilmes the quantFilmes to set
     */
    public void setQuantFilmes(int quantFilmes) {
        this.quantFilmes = quantFilmes;
    }

    /**
     * @return the filmesDisponiveis
     */
    public ArrayList<String> getFilmesDisponiveis() {
        return filmesDisponiveis;
    }

    /**
     * @param filmesDisponiveis the filmesDisponiveis to set
     */
    public void setFilmesDisponiveis(ArrayList<String> filmesDisponiveis) {
        this.filmesDisponiveis = filmesDisponiveis;
    }

    /**
     * @return the filmesAlugados
     */
    public ArrayList<String> getFilmesAlugados() {
        return filmesAlugados;
    }

    /**
     * @param filmesAlugados the filmesAlugados to set
     */
    public void setFilmesAlugados(ArrayList<String> filmesAlugados) {
        this.filmes = filmesAlugados;
    }

    /**
     * @return the filmesParaRepor
     */
    public ArrayList<String> getFilmesParaRepor() {
        return filmesParaRepor;
    }

    /**
     * @param filmesParaRepor the filmesParaRepor to set
     */
    public void setFilmesParaRepor(ArrayList<String> filmesParaRepor) {
        this.filmesParaRepor = filmesParaRepor;
    }
     
    /**
     * Imprime a lista completa de filmes.
     */
   public void imprimirFilmes(){
       for(int i = 0; i < this.filmes.size();i++){
           System.out.println("Filme : ["+i+"] "+this.filmes.get(i));
       }
       
   } 
   public void addFilme(String filme){
       this.filmes.add(filme);
       this.quantFilmes ++;
   }
    
}
