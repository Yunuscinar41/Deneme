
public class Dragon extends beyblade{
    private String kutsalcanavar;
    private String gizliyetenek;

    public Dragon(String kutsalcanavar, String gizliyetenek, String beybladeci, int donushizi, int saldirigücü) {
        super(beybladeci, donushizi, saldirigücü);
        this.kutsalcanavar = kutsalcanavar;
        this.gizliyetenek = gizliyetenek;
    }

    @Override
    public void Bilgilerigöster8() {
        super.Bilgilerigöster8();
        System.out.println("Kutsal canavar adı : " + kutsalcanavar);
        System.out.println("Gizli yetenek : " + gizliyetenek);
    }

    @Override
    public void kutsalcanavarortayacikar() {
        System.out.println(getBeybladeci() + " "+ kutsalcanavar + " ı ortaya çıkarıyor...");
        System.out.println(getBeybladeci() + " ın saldırısı : Hayalet kasırgası");  
    }
    
}
