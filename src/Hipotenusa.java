import java.util.Scanner;

public class Hipotenusa {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double cateto1;
    do {
      System.out.println("Ingresa el cateto 1:");
      cateto1 = sc.nextDouble();
      if (cateto1 <= 0) {
        System.out.println("Debes ingresar un valor mayor a 0");
      }
    } while (cateto1 <= 0);

    double cateto2;
    do {
      System.out.println("Ingresa el cateto 2:");
      cateto2 = sc.nextDouble();
      if (cateto2 <= 0) {
        System.out.println("Debes ingresar un valor mayor a 0");
      }
    } while (cateto2 <= 0);

    // double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

    System.out.printf("La hipotenusa del cateto1: %.2f y cateto2: %.2f, es %.2f", cateto1, cateto2, hipotenusa);
  }
}
