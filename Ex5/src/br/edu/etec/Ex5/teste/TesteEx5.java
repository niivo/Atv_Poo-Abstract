/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.Exercicio5.teste;
import br.edu.etec.Exercicio5.model.Guitarra;
import br.edu.etec.Exercicio5.model.Piano;
import br.edu.etec.Exercicio5.model.InstrumentoMusical;
/**
 *
 * @author Admin
 */
public class TesteEx5 {
    public static void main(String[] args) {
        InstrumentoMusical guitarra = new Guitarra();
        InstrumentoMusical piano = new Piano();
        
        System.out.println(" Piano: ");
        piano.tocar();
        
        System.out.println("\n Guitarra: ");
        guitarra.tocar();
    }
}
