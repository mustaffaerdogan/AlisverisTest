import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kaç adet laptop almak istiyorsunuz?\nLütfen bir sayı girin: ");
        int laptopAdedi = scanner.nextInt();
        
        System.out.print("Kaç adet mouse almak istiyorsunuz?\nLütfen bir sayı girin: ");
        int mouseAdedi = scanner.nextInt();
        
        AlisverisSepeti sepet = new AlisverisSepeti();
        
        Urun laptop = new Urun("Laptop", 1500);
        sepet.urunEkle(laptop, laptopAdedi);
        
        Urun mouse = new Urun("Mouse", 20);
        sepet.urunEkle(mouse, mouseAdedi);
        
        double toplamFiyat = sepet.toplamFiyatiHesapla();
        
        System.out.println("Alınan laptop adedi: " + laptopAdedi + ", Laptopların Toplam Fiyatı: ₺ " + (laptop.getFiyat() * laptopAdedi));
        System.out.println("Alınan mouse adedi: " + mouseAdedi + ", Mouselerın Toplam Fiyatı: ₺ " + (mouse.getFiyat() * mouseAdedi));
        System.out.println("Toplam Fiyat: ₺ " + toplamFiyat);
    }
}
