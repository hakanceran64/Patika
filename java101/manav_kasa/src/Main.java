/*
 * @Authors: Hakan CERAN
 * @Date: 17.09.2022
 * @Content: Manav kasa
 **/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double t_armut = 2.14, t_elma = 3.67, t_domates = 1.11, t_muz = 0.95, t_patlican = 5.00;
        double armut, elma, domates, muz, patlican;
        double total = 0;

        try(Scanner inp = new Scanner(System.in))
        {
            System.out.println("Armut kaç kilo!");
            armut = inp.nextDouble();

            System.out.println("Elma kaç kilo!");
            elma = inp.nextDouble();

            System.out.println("Domates kaç kilo!");
            domates = inp.nextDouble();

            System.out.println("Muz kaç kilo!");
            muz = inp.nextDouble();

            System.out.println("Patlıcan kaç kilo!");
            patlican = inp.nextDouble();
        }

        total = t_armut * armut + t_elma * elma + t_domates * domates + t_muz * muz + t_patlican * patlican;

        System.out.println("Toplam tutar: " + total);
    }
}