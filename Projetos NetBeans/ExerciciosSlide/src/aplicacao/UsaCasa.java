/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;
import classes.Casa;
import classes.Pessoa;
/**
 *
 * @author Mauro Hemerly (Hämmerli) Gazzani <mauro.hemerly@gmail.com>
 */
public class UsaCasa {
    public static void main(String[] args) {
        Pessoa proprietario = new Pessoa("JOão Paulo","123.456.789-00");
        Casa cas1 = new Casa(proprietario,"Av. dos Vinhedos, 1.200");
        Casa cas2 = new Casa("Ana Claudia","1111.222.333-99","Av. dos Vinhedos, 1.500");
        
        
        cas1.setEndereco("Rua Armando LOmbardi, 303");
        
       // Pessoa proprietarioCasa1 = cas1.getProprietario();
       // proprietarioCasa1.setCpf("333.444.555.88");
       cas1.getProprietario().setCpf("333.444.555.88");
       
        
        System.out.println(cas1);
        
        System.out.println(cas2);
    }
}
