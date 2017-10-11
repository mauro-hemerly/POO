package metodoatributoestatico;

/**
 *
 * @author Mauro Hemerly (Hämmerli) Gazzani
 */
public class MetodoAtributoEstatico {

    public static void main(String[] args) {   // método de classe
         int km = 12; 
        
                
         // utilizando método Estático local
         System.out.println(converteKmMetro(km)); 
         
         // utilizando método Estático na Classe Utilitarios
         System.out.println(Utilitarios.converteKmMetros(km)); 
         
         
         Utilitarios util = new Utilitarios();
         
         // utilizando método na Classe Utilitarios
         System.out.println(util.converteKmMetrosInstancia(km)); 
         
         System.out.println("1 Km = " + Utilitarios.METROS_POR_KILOMETRO + " m");
                  
         System.out.println(Math.PI);
         
         Singleton s1 = Singleton.getInstance();
         Singleton s2 = Singleton.getInstance();
         
         System.out.println(s1);
         
         System.out.println(s2);
    }; // main
    
    
    private static int converteKmMetro(int km) {  // método de classe
        int m = km * 1000;
        
        return m;
    };
    
};  
