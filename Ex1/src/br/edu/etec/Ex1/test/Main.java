/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.Ex1.test;
import br.edu.etec.Ex1.model.Animal;
import br.edu.etec.Ex1.model.Cachorro;
import br.edu.etec.Ex1.model.Gato;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
    Animal cachorro = new Cachorro();
    Animal gato = new Gato();
    
    gato.fazerSom();
    cachorro.fazerSom();
    }
    
    
}
