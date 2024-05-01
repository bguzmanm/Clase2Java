import java.util.Scanner;

public class Perimetro {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    float alto;
    do {
      System.out.println("Ingresa el alto:");
      alto = sc.nextFloat();
      if (alto <= 0) {
        System.out.println("Debes ingresar un alto mayor a 0");
      }
    } while (alto <= 0);

    float largo;
    do {
      System.out.println("Ingresa el largo:");
      largo = sc.nextFloat();
      if (largo <= 0) {
        System.out.println("Debes ingresar un largo mayor a 0");
      }
    } while (largo <= 0);

    // float perimetro = 2 * alto + 2 * largo;
    float perimetro = 2 * (alto + largo);

    System.out.printf("El perimetro es %f", perimetro);


  }
}