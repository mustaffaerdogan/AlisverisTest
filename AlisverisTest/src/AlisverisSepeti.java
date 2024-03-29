import java.util.ArrayList;
import java.util.List;

public class AlisverisSepeti {
    private List<Urun> urunler;
    private List<Integer> adetler;
    
    public AlisverisSepeti() {
        this.urunler = new ArrayList<>();
        this.adetler = new ArrayList<>();
    }
    
    public void urunEkle(Urun urun, int adet) {
        urunler.add(urun);
        adetler.add(adet);
    }
    
    public double toplamFiyatiHesapla() {
        double toplamFiyat = 0;
        for (int i = 0; i < urunler.size(); i++) {
            toplamFiyat += urunler.get(i).getFiyat() * adetler.get(i);
        }
        return toplamFiyat;
    }
}
