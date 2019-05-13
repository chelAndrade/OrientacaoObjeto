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
public class Cliente {
   private String nome;
   private int CPF;
   private int telefone;
   private int idade;
   private int codigoFilme;
   private int Emprestimo [] = new int[tam];
 

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the CPF
     */
    public int getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the codigoFilme
     */
    public int getCodigoFilme() {
        return codigoFilme;
    }

    /**
     * @param codigoFilme the codigoFilme to set
     */
    public void setCodigoFilme(int codigoFilme) {
        this.codigoFilme = codigoFilme;
    }

    /**
     * @return the Emprestimo
     */
    public int[] getEmprestimo() {
        return Emprestimo;
    }

    /**
     * @param Emprestimo the Emprestimo to set
     */
    public void setEmprestimo(int[] Emprestimo) {
        this.Emprestimo = Emprestimo;
    }
   
   
    
}
