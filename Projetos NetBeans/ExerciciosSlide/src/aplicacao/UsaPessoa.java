/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import classes.Pessoa;


/**
 *
 * @author Mauro Hemerly (Hämmerli) Gazzani <mauro.hemerly@gmail.com>
 */
public class UsaPessoa {
    public static void main(String[] x) {
        Pessoa pedro = new Pessoa();
        
        Pessoa pes2 = new Pessoa("Luis Inacio Lula","000.000.000-00");
       
        System.out.println(pedro.getNome());        
         System.out.println(pedro.getCpf()); 
         
         System.out.println(pes2.getNome());        
         System.out.println(pes2.getCpf()); 
        
    }
}
