/*
 * @Authors: Hakan CERAN
 * @Date: 17.09.2022
 * @Content: Hipotenus Bulma
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c;

        try(Scanner inp = new Scanner(System.in)){
            System.out.println("A: ");
            a = inp.nextDouble();

            System.out.println("B: ");
            b = inp.nextDouble();
        }
        
        c = Math.sqrt((a*a) + (b*b));

        System.out.println("Hipotenus: " + c);
    }
}