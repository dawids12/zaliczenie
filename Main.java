import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    float a,b,c,x;
    System.out.println("Podaj współczynnik a: ");
    a = scan.nextFloat();
    System.out.println("Podaj współczynnik b: ");
    b = scan.nextFloat();
    System.out.println("Podaj współczynnik c: ");
    c = scan.nextFloat();

    if(a == 0)
    {
      if(b != 0)
      {
        System.out.println("Równanie liniowe");
      }
    }
    else{
      System.out.println("Równanie kwadratowe");
    }
    
  }
}