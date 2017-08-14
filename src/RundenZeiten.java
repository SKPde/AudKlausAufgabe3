import java.util.Scanner;

public class RundenZeiten {
    public static void main (String[] args) {
      AutoListe list = new AutoListe();
      Scanner in = new Scanner(System.in);
      String eingabe;
      System.out.println("Fahrer mit Rundenzeiten eingeben:");
      do {
        Auto a = new Auto();
        System.out.print("Fahrer: ");
        a.fahrer = in.nextLine();
        System.out.print("\nSchnellste Rundenzeit: ");
        a.zeit = in.nextInt();
        //list.enter (a);
        System.out.print("\nNoch ein Fahrer? (j/n): ");
        eingabe = in.nextLine();
        //weiter = eingabe.charAt(0);
      } while ('j' == in.nextLine().charAt(0));
      System.out.println("Die sortierte Rundenzeiten-Liste:");
      //list.print();
} }
