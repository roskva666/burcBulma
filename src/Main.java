import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //DEĞİŞKENLER
        double yariCap,alan,cevre;
        double pi = 3.14;


        //GİRDİLER

        Scanner input = new Scanner(System.in);

        System.out.println("LÜTFEN DAİRENİN YARIÇAPINI GİRİNİZ: ");
        yariCap = input.nextDouble();

        //HESAPLAMALAR

        alan = pi * yariCap * yariCap;
        cevre = 2 * pi * yariCap;

        //CIKTILAR

        System.out.println("DAİRENİN ALANI: " + alan);
        System.out.println("DAİRENİN ÇEVRESİ: " + cevre);

    }
}