import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imie ");
        String name = scanner.nextLine();
        System.out.println("Podaj swoje imie ");
        String surname = scanner.nextLine();
        System.out.println("Witaj " + name + " " + surname);
        System.out.println("podaj swoją klasę ");
        String Shoolclass = scanner.nextLine();
        System.out.println("Chodzisz do kalsy " + Shoolclass);

        while (true ) {
        System.out.println("Podaj liczbę wiazd w obzerwowalnym wszechświecie");
        int gwiazdy = scanner.nextInt();
            if (gwiazdy == 300) {
                System.out.println("Wowo jesteś matemaksem");
                break;
            } else if (gwiazdy >= 300) {
                System.out.println("Za dużo");
                continue;
            } else if (gwiazdy <= 300) {
                System.out.println("Za mało");
                continue;
            } else {
                System.out.println("Coś zepsułeś!");
                break;
            }
        }
    }
}