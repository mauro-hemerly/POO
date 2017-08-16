package Principal;

//Embora a linguagem Java seja orientada a objetos, nem tudo são objetos. 
// Há definido tipos básicos chamados de tipos primitivos.
// Segue abaixo uma lista de todos os tipos primitivos em Java:
//      byte (inteiro sinalizado, 1 byte)
//      short (inteiro sinalizado, 2 bytes)
//      int (inteiro sinalizado, 4 bytes)
//      long (inteiro sinalizado, 8 bytes)
//      float (fracionário IEEE 754, 4 bytes) - precisão simples
//      double (fracionário IEEE 754, 8 bytes) - precisão dupla
//      char (caractere, 2 bytes)
//      char (inteiro não sinalizado, 2 bytes) 
//      boolean (true ou false, 1 byte) 
// Java é uma lingiagem fortemente tipada, isto significa que as variáveis 
//    precisam ser definidas (declaradas) antes de seu uso.

/**
 *
 * @author Mauro Hemerly (Hämmerli) Gazzani <mauro.hemerly@gmail.com>
 */

public class VariaveisTipos {

    public static void main(String[] args) {
         // Para declarar e atribuir um valor usamos a seguinte sintaxe:
         int numero;        // ou: int numero = 5;
         numero = -5;
         
         // Para declarar e atribuir um valor fracionário usamos a seguinte sintaxe:
         double fracionario = 4.5;
         
         // Para declarar e atribuir um caractere usamos a seguinte sintaxe:
         char letra = 'a';
         
         // Para declarar e atribuir uma sequência de um ou mais caractere usamos a seguinte sintaxe:
         String frase = "Faculdade Pitagoras de Uberlandia.";
         
         // Para declarar e atribuir um valor inteiro não sinalizado (sempre positivo) 
         //   usamos a seguinte sintaxe:
         char intSemSinal = 100;   // Não podemos fazer assim: char intSemSinal = -100;
         
         // Para declarar e atribuir valores lógicos usamos a seguinte sintaxe:
         boolean verdade = true;
         boolean mentira = false;
    }
    
}
