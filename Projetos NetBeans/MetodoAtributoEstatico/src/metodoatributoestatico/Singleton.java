/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoatributoestatico;

/**
 *
 * @author Mauro Hemerly (Hämmerli) Gazzani
 */
public class Singleton {
    private final static Singleton INSTANCE = new Singleton();
    
    
    public static Singleton getInstance() {
      return INSTANCE;  
    };
    
};
