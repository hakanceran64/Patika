/*
 * @Authors: Hakan CERAN
 * @Date: 17.09.2022
 * @Content: Vücut kitle indeksi hesaplama
 **/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy, kilo, bmi;

        try(Scanner inp = new Scanner(System.in))
        {
            System.out.println("Lütfen boyunuzu metre cinsinden giriniz: ");
            boy = inp.nextDouble();

            System.out.println("Lütfen kilonuzu giriniz: ");
            kilo = inp.nextDouble();
        }

        bmi = kilo / (boy * boy);

        System.out.println("Vücut kitle indeksiniz: " + bmi);
    }
}