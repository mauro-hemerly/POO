package Principal;

import Classes.Aluno;     // ou: import Classes.*;

/**
 *
 * @author Mauro Hemerly (Hämmerli) Gazzani <mauro.hemerly@gmail.com>
 */

// Classe Principal
public class TesteAluno {   
    public static void main(String[] args) { 
        
        // Instanciando objeto do tipo Aluno.
        // Neste caso, o aluno de nome 'Jose Carlos da Silva' e matrícula '190785'.
        Aluno a1 = new Aluno(); // a1: identificação do obejto
        
        // Instanciando outro objeto do tipo Aluno.
        // Neste caso, o aluno de nome 'Adriano Araujo' e matrícula '123456'.
        Aluno a2 = new Aluno("Adriano Araujo","123456");   // a2: identificação do 2º objeto
        
    }
    
}
