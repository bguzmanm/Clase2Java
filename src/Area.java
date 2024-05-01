import java.util.Scanner;

public class Area {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    float alto;
    do {
      System.out.println("Ingresa el alto:");
      alto = sc.nextFloat();
    } while (alto <= 0);

    float largo;
    do {
      System.out.println("Ingresa el largo:");
      largo = sc.nextFloat();
    } while (largo <= 0);

    float area = alto * largo;

    System.out.printf("El área es %f", area);


  }
}