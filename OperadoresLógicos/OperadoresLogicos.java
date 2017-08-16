import java.util.Scanner;

public class OperadoresLogicos {

  public static void main(String[] args) {
        
int x = 3;
int y = 5;
int z = 7;

System.out.println("x é maior do que y? " + (x > y));
System.out.println("x é maior do que y ou maior do que z? " + (x > y || x > z ));

System.out.println("x NÃO é maior do que y ou NÃO é maior do que z? " + (!(x > y) || !(x > z )));

System.out.println("x é diferente de z? " + (x != z));

System.out.println("x é maior do que y E maior do que z? " + (x > y && x > z ));

System.out.println("x é maior do que z? " + (x > z));
System.out.println("x NÃO é menor do que z? " + !(x < z));

/*((3 > 2) == true); //verdade
((3 < 2) == false); //falso

((3 > 2) || (3 > 5) == true); //verdade
((3 > 2) || (3 > 5) == false); //falso
((3 > 2) || (3 > 5)); //verdade

((1 < 2) && (1 < 5) == true); //verdade
!(((1 < 2) && (1 < 5) == false)); //verdade
      */
    
  }

}
