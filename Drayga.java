
public class Drayga extends beyblade {
    private String kutsalcanavar;

    public Drayga(String kutsalcanavar, String beybladeci, int donushizi, int saldirigücü) {
        super(beybladeci, donushizi, saldirigücü);
        this.kutsalcanavar = kutsalcanavar;
    }

    @Override
    public void Bilgilerigöster8() {
        super.Bilgilerigöster8();
        System.out.println("Kutsal canavar adı : " + kutsalcanavar);

    }

    @Override
    public void kutsalcanavarortayacikar() {
        System.out.println(getBeybladeci() + " "+ kutsalcanavar + " ı ortaya çıkarıyor...");
        System.out.println(getBeybladeci() + " ın saldırısı : Kaplan Pencesi");
    }
    
}
