import Entites.Rent;

import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.US;

public class Class {
    public static void main(String[] args) {

        Locale.setDefault(US);
        Scanner sc = new Scanner(System.in);

        Rent r = new Rent("Maria", "maria@gmail.com");

        Rent[] vect = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 1; 1<=n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            vect[roomNumber] = new Rent(name, email);
        }
        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i=0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
    }
}
