/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.Ex4.model;

/**
 *
 * @author Admin
 */
public class Gerente extends Funcionario {
    
    double salario;

    public Gerente(double salario) {
        this.salario = salario;
    }
    
    @Override
    public double calcularSalario(){
        return salario*1.10;
    }
}
