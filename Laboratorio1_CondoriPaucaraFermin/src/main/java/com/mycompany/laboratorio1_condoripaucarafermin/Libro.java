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
public class Libro extends MaterialBibliografico{
    //static final long serialVersionUID=41L;
    //atributos
    private int edicion;
    private String area;
    Scanner lee=new Scanner(System.in);
    
    //constructores
    
    //metodos
    //METODO SOBREESCRITO
    @Override
    public void registrar(){
        super.registrar();
        System.out.println("Digite la edicion");
        this.edicion=lee.nextInt();
        lee.nextLine();
        System.out.println("Digite el area");
        this.area=lee.nextLine();
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Edicion: "+this.edicion);
        System.out.println("Area: "+this.area);
    }
    //********FIN METODO SOBREESCRITO*******
    
    //getter y setter

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    
    
}
