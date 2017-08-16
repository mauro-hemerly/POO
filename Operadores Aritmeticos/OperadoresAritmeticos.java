/**
 *
 * @author Mauro Hemerly (Hämmerli) Gazzani <mauro.hemerly@gmail.com>
 */

public class OperadoresAritmeticos{

  public static void main(String[] args){
    int notaAluno1 = 85, 
        notaAluno2 = 60,
        notaAluno3 = 55, 
        notaAluno4 = 40;
    float mediaAluno;

    /* Para realizar o cálculo de DIVISÃO deve-se utilizar os parênteses, pois sem eles o primeiro não será obtido o mesmo resultado,
       porque o cálculo feito segue a mesma regra da matemática, DIVISÃO, MULTIPLICAÇÃO, SUBTRAÇÃO e ADIÇÃO!
    */
    mediaAluno = (notaAluno1 + notaAluno2 + notaAluno3 + notaAluno4) / 4;
    
    System.out.println("Nota do Aluno1: " + notaAluno1);
    System.out.println("Nota do Aluno2: " + notaAluno2);
    System.out.println("Nota do Aluno3: " + notaAluno3);
    System.out.println("Nota do Aluno4: " + notaAluno4);
    System.out.println("Media final dos Alunos: " + mediaAluno);

    int soma = 10;
    int multiplicacao = 10;
    int divisao = 10;
    int restoDivisao = 5;

    soma += 3;
    multiplicacao *= 2;
    divisao /= 2;
    restoDivisao %= 2;

    System.out.println("-- soma = " + soma);
    System.out.println("-- multiplicacao = " + multiplicacao);
    System.out.println("-- divisao = " + divisao);
    System.out.println("-- restoDivisao = " + restoDivisao);


  }

}
