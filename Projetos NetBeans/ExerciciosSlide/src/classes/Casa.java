/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Mauro Hemerly (Hämmerli) Gazzani <mauro.hemerly@gmail.com>
 */
public class Casa {
    private Pessoa proprietario;
    private String endereco;

    public Casa(Pessoa proprietario, String endereco) {
        this.proprietario = proprietario;
        this.endereco = endereco;
    }
    
    
    public Casa(String nome, String cpf, String endereco) {
        this.proprietario = new Pessoa(nome, cpf);
        this.endereco = endereco;
    }
    

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Objeto do Tipo Casa:\n" + proprietario.toString() + "\nEndereco: " + endereco;
    }
    
    
}
