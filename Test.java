
import java.util.Scanner;


public class Test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Beyblade programına hoşgeldiniz...");
        System.out.println("Çıkış için qya basınız...");
        
        while(true){
            System.out.println("Hangi beyblade i üretmek istiyorsunuz ?");
            String islem = scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyolar...");
                break;
                
            }
            else{
                BeybladeFabrikası fabrika = new BeybladeFabrikası();
                beyblade beyblade = fabrika.beybladeüret(islem);
                
                if(beyblade == null){
                    System.out.println("Lütfen geçerli bir beyblade ismi giriniz...");
                    
                }
                else{
                    beyblade.Bilgilerigöster8();
                    beyblade.saldir();
                    beyblade.kutsalcanavarortayacikar();
                }
            }
            
        }
        
        
    }
            
}
