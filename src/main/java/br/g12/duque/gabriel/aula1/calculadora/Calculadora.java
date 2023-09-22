/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.g12.duque.gabriel.aula1.calculadora;

import java.awt.Color;

/**
 *
 * @author 08154
 */
public class Calculadora {
    public static void main(String[] args) {
        FrmCalculadora calc = new FrmCalculadora();
        calc.setTitle( "Calculadora do SkyNet");
        calc.setBackground(Color.yellow);
        calc.setLocationRelativeTo(calc);
        calc.setVisible(true);
        
    }
    
}
