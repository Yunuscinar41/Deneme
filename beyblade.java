
public class beyblade {
    private String beybladeci;
    private int donushizi;
    private int saldirigücü;

    public beyblade(String beybladeci, int donushizi, int saldirigücü) {
        this.beybladeci = beybladeci;
        this.donushizi = donushizi;
        this.saldirigücü = saldirigücü;
    }

    public String getBeybladeci() {
        return beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public int getDonushizi() {
        return donushizi;
    }

    public void setDonushizi(int donushizi) {
        this.donushizi = donushizi;
    }

    public int getSaldirigücü() {
        return saldirigücü;
    }

    public void setSaldirigücü(int saldirigücü) {
        this.saldirigücü = saldirigücü;
    }
     public void saldir(){
         System.out.println(getBeybladeci()+ " "+ saldirigücü + " ve " + donushizi + " ile saldırıyor...");
         
     }
     public void kutsalcanavarortayacikar(){
         System.out.println("Bu beyblade'in kutsal canavarı bulunmuyor...");
     }
     public void Bilgilerigöster8(){
         System.out.println("Beybladeci : "+ beybladeci);
         System.out.println("Dönüş hızı : "+ donushizi);
         System.out.println("Saldırı gücü : "+ saldirigücü);
         
     }    
}
