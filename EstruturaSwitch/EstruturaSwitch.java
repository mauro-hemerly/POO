import java.util.Scanner;

public class EstruturaSwitch {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("INFORME O ULTIMO NUMERO DA PLACA: ");
    int numeroPlaca = entrada.nextInt();

    switch (numeroPlaca) {
      case 1:
        System.out.println("DATA DE PAGAMENTO DIA 12!");
        break;
      case 2:
        System.out.println("DATA DE PAGAMENTO DIA 14!");
        break;
      case 3:
        System.out.println("DATA DE PAGAMENTO DIA 16!");
        break;
      case 4:
        System.out.println("DATA DE PAGAMENTO DIA 18!");
        break;
      case 5:
        System.out.println("DATA DE PAGAMENTO DIA 20!");
        break;
      case 6:
        System.out.println("DATA DE PAGAMENTO DIA 22!");
        break;
      case 7:
        System.out.println("DATA DE PAGAMENTO DIA 24!");
        break;
      case 8:
        System.out.println("DATA DE PAGAMENTO DIA 26!");
        break;
      case 9:
        System.out.println("DATA DE PAGAMENTO DIA 28!");
        break;
      default:
        System.out.println("VERIFIQUE O FINAL, POIS O NUMERO INFORMADO NAO EXISTE!");
    }
  }

}
