/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.Ex2.model;

/**
 *
 * @author Admin
 */
public class Retangulo extends Formula {

    public Retangulo(double b, double h) {
        this.b = b;
        this.h = h;
    }
    
    double b;
    double h;
    
    @Override
    public double calcularArea(){
        return b*h;
    }
}
