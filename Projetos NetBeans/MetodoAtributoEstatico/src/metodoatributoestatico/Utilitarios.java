package metodoatributoestatico;

/** 
 *
 * @author Mauro Hemerly (Hämmerli) Gazzani
 */
public class Utilitarios {
    public static final int METROS_POR_KILOMETRO = 1000;  // constante
    
    private static int UmKm = 1000; //  variável de instância/classe
    
    public static int converteKmMetros(int km) {  // método de classe
        int m = km * METROS_POR_KILOMETRO;
        
        return m;  // return km * METROS_POR_KILOMETRO;
    };
    
    public int converteKmMetrosInstancia(int km) {  //  método de instância
        int m = km * METROS_POR_KILOMETRO;
        
        return m;   // return km * METROS_POR_KILOMETRO;
    };
    
    
};




