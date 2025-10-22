/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.Ex4.test;
import br.edu.etec.Ex4.model.Funcionario;
import br.edu.etec.Ex4.model.Gerente;
import br.edu.etec.Ex4.model.Vendedor;
/**
 *
 * @author Admin
 */
public class Main {
    Funcionario vendedor= new Vendedor(1900);
    Funcionario gerente = new Gerente(2000);
    
    System.out.println("O salario de GErente eh: " + gerente.calcularSalario());
    
    
}
