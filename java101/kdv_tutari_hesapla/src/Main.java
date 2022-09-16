/*
 * @Authors: Hakan CERAN
 * @Date: 17.09.2022
 * @Content: KDV Tutarı Hesaplama
 */

 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);

        System.out.println("Tutar giriniz: ");
        tutar = input.nextDouble();

        if(tutar > 0 & tutar < 1000){
            kdvOran = 0.18;
        } else {
            kdvOran = 0.08;
        }

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("");
        System.out.println("Tutar: " + tutar);
        System.out.println("KDV Oranı: " + kdvOran);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDVli Tutar: " + kdvliTutar);
    }
}