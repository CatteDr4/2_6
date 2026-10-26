import java.util.Scanner;

public class Main {

  public static boolean czyPierwsza(int a) {
    if (a <= 1) {
      return false;
    }

    for (int i = 2; i<= Math.sqrt(a); i++) {
      if (a % i == 0) {
        return false;
      }
    }
    return true;
  }
  
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    boolean wynik;
    
    System.out.print("Podaj liczbe: ");
    int liczba = scanner.nextInt();

    wynik = czyPierwsza(liczba);

    if(wynik){
      System.out.println("ta liczba jest pierwsza");
    } else {
      System.out.println("ta liczba nie jest pierwsza");
    }
  }
}