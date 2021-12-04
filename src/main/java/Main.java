import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int count = 0;

        do {
            System.out.println("Escreve um número de 0 a 10: ");
             x = sc.nextInt();
             count++;
        } while (x != 9);
        if (x == 9) {
            System.out.println("Você tentou " + count + " vezes até acertar");
        }
    }
}
