/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.pooexercicio.test;
import br.edu.etec.pooexercicio.model.Bispo;
import br.edu.etec.pooexercicio.model.Cavalo;
import br.edu.etec.pooexercicio.model.Peao;
import br.edu.etec.pooexercicio.model.Peca;
/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
    
    Peca peao = new Peao();
    Peca cavalo = new Cavalo();
    Peca bispo = new Bispo();
    
    peao.mover();
    cavalo.mover();
    bispo.mover();
    }
    
    
}
