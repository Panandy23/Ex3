import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        float x;
        float y;
        float suma;
        float roznica;
        float iloraz;
        float iloczyn;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę x: ");
        x = scanner.nextFloat();
        System.out.println("Podaj liczbę y: ");
        y = scanner.nextFloat();

        suma = x + y;
        roznica = x - y;
        iloraz = x/y;
        iloczyn = x * y;

        System.out.println("Suma tych liczb to: ");
        System.out.printf("%.2f", suma);
        System.out.println("\n" + "Różnica tych liczb to: ");
        System.out.printf("%.2f", roznica);
        System.out.println("\n" + "Iloraz tych liczb to: ");
        System.out.printf("%.2f", iloraz);
        System.out.println("\n" + "Iloczyn tych liczb to: ");
        System.out.printf("%.2f", iloczyn);


    }
}
