/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author Kaliane
 */
public class CD {
    private int codigo, faixas;
    private String titulo, cantores, genero, gravadora, pais;
    private Date lancamento;

    public Date getLancamento() {
        return lancamento;
    }

    public void setLancamento(Date lancamento) {
        this.lancamento = lancamento;
    }
    

    public CD() {
    }

    public CD(int codigo, int faixas, String titulo, String cantores, String genero, String gravadora, String pais) {
        this.codigo = codigo;
        this.faixas = faixas;
        this.titulo = titulo;
        this.cantores = cantores;
        this.genero = genero;
        this.gravadora = gravadora;
        this.pais = pais;
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getFaixas() {
        return faixas;
    }

    public void setFaixas(int faixas) {
        this.faixas = faixas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCantores() {
        return cantores;
    }

    public void setCantores(String cantores) {
        this.cantores = cantores;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
}
