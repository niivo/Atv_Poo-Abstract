/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.Ex4.model;

/**
 *
 * @author Admin
 */
public class Vendedor extends Funcionario{

    public Vendedor(double salario) {
        this.salario = salario;
    }
    double salario;
    
    @Override
    public double calcularSalario(){
        return salario;
    }
    
}
