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
public class ProyectoGrado extends MaterialBibliografico{
    //static final long serialVersionUID=42L;
    //atributos
    private String tutor;
    private String revisor;
    Scanner lee=new Scanner(System.in);
    //constructores
    //metodos
    //********METODO SOBREESCRITO**********
    @Override
    public void registrar(){
        super.registrar();
        System.out.println("Digite tutor");
        this.tutor=lee.nextLine();
        System.out.println("Digite revisor");
        this.revisor=lee.nextLine();
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Tutor: "+this.tutor);
        System.out.println("Revisor: "+this.revisor);
    }
    //********FIN METODO SOBREESCRITO*******
    
    //getter y setter

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }
    
    
}
