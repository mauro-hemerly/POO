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
public class Porta {
    private boolean aberta;
    private String cor;
    private String tipoMaterial;

    public Porta(String cor, String tipoMaterial) {
        this.aberta = true;
        this.cor = cor;
        this.tipoMaterial = tipoMaterial;
    }

    
    public boolean getAberta() {
        return aberta;
    }

    public void  abrir() {
        aberta = true;
    }
    
     public void  fechar() {
        aberta = false;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

       
    
    
}
