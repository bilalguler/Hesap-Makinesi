import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int devam = 1;
        while(devam==1)  {

            System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz:");
            System.out.println("\t1) Toplama\n\t2) Çıkarma\n\t3) Çarpma\n\t4) Bölme");

            int islem = scan.nextInt();

            switch (islem) {
                case 1:
                    System.out.println("Toplamak İstediğiniz Sayıları Giriniz:");
                    int sayi1 = scan.nextInt();
                    int sayi2 = scan.nextInt();
                    System.out.println("İşleminizin Sonucu: " + (sayi1 + sayi2));
                    break;
                case 2:
                    System.out.println("Çıkarmak İstediğiniz Sayıları Giriniz:");
                    sayi1 = scan.nextInt();
                    sayi2 = scan.nextInt();
                    System.out.println("İşleminizin Sonucu: " + (sayi1 - sayi2));
                    break;
                case 3:
                    System.out.println("Çarpmak İstediğiniz Sayıları Giriniz:");
                    sayi1 = scan.nextInt();
                    sayi2 = scan.nextInt();
                    System.out.println("İşleminizin Sonucu: " + (sayi1 * sayi2));
                    break;
                case 4:
                    System.out.println("Bölmek İstediğiniz Sayıları Giriniz:");
                    sayi1 = scan.nextInt();
                    sayi2 = scan.nextInt();
                    System.out.println("İşleminizin Sonucu: " + ((double)sayi1 / sayi2));
                    break;
            }
            System.out.println("----------------------------------------");
            System.out.println("Devam Etmek İçin Lütfen 1'e Basınız.");
            devam = scan.nextInt();
        }
        System.out.println("----------------------------------------");
        System.out.println("Hesap Makinesinden Çıkış Yapıldı, Teşekkürler.");
    }
}
