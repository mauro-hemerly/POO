package Principal;

/**
 *
 * @author Mauro Hemerly (Hämmerli) Gazzani <mauro.hemerly@gmail.com>
 */
public class EstruturasCondicionais {

    public static void main(String[] args) {
         // Java usa variáveis booleanas para avaliar condições. 
         // Os valores lógicos (booleanos) true e false são retornados quando uma expressão
         //   é comparada ou avaliada.
         
        int a = 4;
        if (a == 4) {
                System.out.println("Igual a 4!");
        }
        else {
            System.out.println("Diferente de 4!");
        }
        
        // Naturalmente que não precisanos sempre vincular expressão condicional a um valor booleano, 
        // podemos usar uma versão mais curta.
        
        boolean b = (a == 4);

        if (b) {
            System.out.println("It's true!");
        }
        
        
        // Operadores Booleanos
        int c = 4;
        int d = 5;
        boolean resultado;
        resultado = c < d; // true
        resultado = c > d; // false
        resultado = c <= 4; // c é menor ou igual a 4 ? - true
        resultado = d >= 6; // d é maior ou igual a 6 ? - false
        resultado = c == d; // c é igual a d ? - false
        resultado = c != d; // c é diferente de d ? - true
        resultado = c > d || c < d; // conectivo (operador) lógico ou - true
        resultado = 3 < c && c < 6; // conectivo (operador) lógico e - true
        resultado = !resultado; // conectivo (operador) lógico não - false
        
        
        // Há uma outra maneira de escrever if-else usando o operador ?:
        a = 4;
        int umOuOito = (a == 4) ? 1 : 8;
        
        
        // É equivalente a
        if (a == 4) {
            umOuOito = 1;
        } else {
            umOuOito = 8;
        }
        
        
        
        // Operadores de comparação de igualdade: == ou equals
        // ==: para tipos de variáveis primitivos
        // equals: para objetos (coo o tipo String)
        
        String strA = new String("UFA!");
        String strB = new String("UFA!");
        String igualStrA = strA;

        boolean r1 = (strA == strB);      // false, não são os mesmos objetos
        boolean r2 = strA.equals(strB); // true, strA e strB são logicamente iguais 
        boolean r3 = (strA == igualStrA);  // true, desde que strA e StrA são os mesmos objetos
        
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
    
}
