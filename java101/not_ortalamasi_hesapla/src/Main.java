import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Degiskenlerin olusturulmasi
        int mat, fizik, kimya, turkce, tarih, muzik;

        try (// Scannter sinifinin tanimlanmasi
        Scanner inp = new Scanner(System.in)) {
            // Kullanicidan degerleri al.
            System.out.println("Matematik notunuz: ");
            mat = inp.nextInt();

            System.out.println("Fizik notunuz: ");
            fizik = inp.nextInt();

            System.out.println("Kimya notunuz: ");
            kimya = inp.nextInt();

            System.out.println("Turkce notunuz:");
            turkce = inp.nextInt();

            System.out.println("Tarih notunuz: ");
            tarih = inp.nextInt();

            System.out.println("Muzik notunuz: ");
            muzik = inp.nextInt();
        }

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);

        double sonuc = toplam / 6.0;

        System.out.println("Ortalamaniz: " + sonuc);

        if (sonuc >= 60.0) {
            System.out.println("Sinifi gecti.");
        } else {
            System.out.println("Sinifta kaldi!");
        }
    }
}
