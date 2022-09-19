/*
 * @Authors: Hakan CERAN
 * @Date: 18.09.2022
 * @Content: Kullanıcı giriş uygulaması
 **/

import java.util.Scanner;

public class Main {
    public static String m_userName = "hakanceran", m_password = "1234";
    public static String userName, password, newPassword;
    public static int hasNewPassword;
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Kullanıcı adınız: ");
        userName = scan.nextLine();
        System.out.println("Şifreniz: ");
        password = scan.nextLine();

        if (userName.equals(m_userName) && password.equals(m_password)) {
            System.out.println("Giriş başarılı.");
            System.out.println("Program sonlandırılmıştır.");
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı.");
            System.out.println("Yeni şifre belirlemek ister misiniz?");
            System.out.println("1) Evet");
            System.out.println("0) Hayır");
            hasNewPassword = scan.nextInt();
    
            while (hasNewPassword == 1) {
                System.out.println("Yeni şifre: ");
                newPassword = scan.nextLine();
                if (newPassword.equals(password)) {
                    System.out.println("Yeni şifre eski şifreden farklı olmalıdır!");
                } else {
                    password = newPassword;
                    System.out.println("Şifre başarıyla güncellenmiştir.");
                    hasNewPassword = 0;
                } // if else
            } // while
        } // if else
    } // void main
} // Class Main