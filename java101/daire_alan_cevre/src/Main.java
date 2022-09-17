/*
 * @Authors: Hakan CERAN
 * @Date: 17.09.2022
 * @Content: Dairenin alanı ve çevresi, Daire diliminin alanı
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        double pi = 3.14, alfa;

        try (Scanner inp = new Scanner(System.in)) {
            System.out.println("Dairenin yarıçapını giriniz: ");
            r = inp.nextInt();
            
            System.out.println("Daire diliminin açısını giriniz: ");
            alfa = inp.nextDouble();
        }

        double alan = pi * r * r;
        double cevre = 2 * pi * 2;
        double alfaAlan = alan * alfa / 360;

        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin cevresi: " + cevre);
        System.out.println("Daire alfa dilim alan: " + alfaAlan);

    }
}