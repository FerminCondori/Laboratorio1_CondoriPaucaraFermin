/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laboratorio1_condoripaucarafermin;

import java.io.Serializable;
import java.util.Scanner;
/**
 *
 * @author FERMIN
 */
public class MaterialBibliografico implements Serializable{
    //static final long serialVersionUID=43L;
    //atributos
    private String titulo;
    private String autor;
    Scanner leer=new Scanner(System.in);
    
    //constructores
    
    //metodos
    public void registrar(){
        System.out.println("Digite titulo");
        this.titulo=leer.nextLine();
        System.out.println("Digite autor");
        this.autor=leer.nextLine();
    }
    
    public void mostrar(){
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Autor: "+this.autor);
    }
    //getter y setter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    

    
    
}
