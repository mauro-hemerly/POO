/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pitagoras.si.principal;
import br.com.pitagoras.si.empresa.Funcionario;

/**
 *
 * @author Mauro Hemerly (Hämmerli) Gazzani <mauro.hemerly@gmail.com>
 */
public class UsaTrabalho2 {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Roberto Carlos da Silva", "M-1111", 1500.00, 0, "Manutenção");
        Funcionario func2 = new Funcionario("Elisio da SIlva", "M-2222",9500.00, 0, "CTO");
        Funcionario func3 = new Funcionario("Oziel da Silva", "M-3333",29900.00, 0, "CEO");
        Funcionario func4 = new Funcionario("Maria Rita da Silva", "Secretaria Executiva", "M-44444");
        
        System.out.println(func1);
        System.out.println(func2);
        System.out.println(func3);
        System.out.println(func4);
        
    }
}
