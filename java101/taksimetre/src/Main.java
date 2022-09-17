/*
 * @Authors: Hakan CERAN
 * @Date: 17.09.2022
 * @Content: Taksimetre
 **/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        double perKm = 2.2;
        double total;
        double startPrice = 10;

        try (Scanner inp = new Scanner(System.in)) {
            System.out.println("Mesafeyi km cinsinden giriniz: ");
            km = inp.nextInt();
        }
        total = (km * perKm);
        total += startPrice;

        total = (total < 20) ? 20 : total;
        System.out.println("Toplam tutar: " + total);
    }
}