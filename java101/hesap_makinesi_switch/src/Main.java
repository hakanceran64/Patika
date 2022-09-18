/*
 * @Authors: Hakan CERAN
 * @Date: 18.09.2022
 * @Content: Hesap Makinesi Switch
 **/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1, number2, select, result = 0;

        try(Scanner inp = new Scanner(System.in)){
            System.out.println("Birinci sayıyı giriniz: ");
            number1 = inp.nextInt();

            System.out.println("İkinci sayıyı giriniz: ");
            number2 = inp.nextInt();

            System.out.println("İşlem seçiniz: ");
            System.out.println("1) Toplama");
            System.out.println("2) Çıkarma");
            System.out.println("3) Çarpma");
            System.out.println("4) Bölme");
            select = inp.nextInt();
        }

        switch (select) {
            case 1 -> result = number1 + number2;
            case 2 -> result = number1 - number2;
            case 3 -> result = number1 * number2;
            case 4 -> result = number1 / number2;
            default -> System.out.println("Yanlış bir parametre girdiniz!");
        }

        System.out.println("İşlem sonucunuz: " + result);
    }
}