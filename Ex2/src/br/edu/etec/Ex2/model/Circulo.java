/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.Ex2.model;

/**
 *
 * @author Admin
 */
public class Circulo extends Formula {

    public Circulo(double raio) {
        this.raio = raio;
    }
    
    double raio;
    
    @Override
    public double calcularArea(){
        return Math.PI * (raio * raio);
    }
}
