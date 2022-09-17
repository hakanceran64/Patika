/*
 * @Authors: Hakan CERAN
 * @Date: 17.09.2022
 * @Content: Hipotenus ve Alan Bulma
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c, area, u;

        try(Scanner inp = new Scanner(System.in)){
            System.out.println("A: ");
            a = inp.nextDouble();

            System.out.println("B: ");
            b = inp.nextDouble();
        }
        
        c = Math.sqrt((a*a) + (b*b));

        u = (a + b + c) / 2;
        area =  Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Hipotenus: " + c);
        System.out.println("Area: " + area);
    }
}