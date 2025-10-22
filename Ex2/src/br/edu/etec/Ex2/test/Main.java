/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.Ex2.test;
import br.edu.etec.Ex2.model.Circulo;
import br.edu.etec.Ex2.model.Formula;
import br.edu.etec.Ex2.model.Retangulo;
/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Formula circulo =  new Circulo(5);
        Formula retangulo = new Retangulo(5, 6);
        
        System.out.println("Area do retangulo: " +retangulo.calcularArea());
        System.out.println("Area do círculo: " +circulo.calcularArea());
    }
    
}
