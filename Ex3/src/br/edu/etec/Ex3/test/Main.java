/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.Ex3.test;
import br.edu.etec.Ex3.model.Bicicleta;
import br.edu.etec.Ex3.model.Carro;
import br.edu.etec.Ex3.model.Veiculo;
/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Veiculo carro= new Carro();
        Veiculo bike =  new Bicicleta();
        
        carro.mover();
        bike.mover();
    }
}
