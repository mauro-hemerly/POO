/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pitagoras.si.empresa;

/**
 *
 * @author Mauro Hemerly (Hämmerli) Gazzani <mauro.hemerly@gmail.com>
 */
public class CargosSalarios {
    private CargosSalarios() {}  // evita instancimento da classe
    
    public static double buscaSalario(String funcao) {
        switch (funcao) {
            case "CTO": 
                return 30000.00;
            case "CEO":
                return 35000.00;
            case "Secretaria Executiva":
                return 15000.00;
            case "Manutenção":  
                return 2100.00;
            default:
                return 0.0;
            
        }
        
    }      
     
}
