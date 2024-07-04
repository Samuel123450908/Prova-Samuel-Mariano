import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Digite seu nome completo!");

      String nome = sc.next();


      System.out.println("digite seu peso");

      String peso = sc.next();

      System.out.println("Digite sua altura");

      String altura = sc.next();

      System.out.println("Seu imc é:");

      sc.close();
   }

}