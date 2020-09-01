
public class BeybladeFabrikası {
    public beyblade beybladeüret(String beyblade_türü){
        
        if(beyblade_türü.equals("Dragon")){
            return new Dragon("Mavi ejderha","Kutsal canavarla konuşma","Takao",800,300);
            
        }
        else if(beyblade_türü.equals("Dranza")){
            return new dranza("Kırmızı anka kuşu","Kai",600,400);
            
        }
        else if(beyblade_türü.equals("Drayga")){
            return new Drayga("Beyaz Kaplan","Rei",800,250);
        
        }
        else if(beyblade_türü.equals("Draciel")){
            return new Draciel("Kara kaplumbağa","Max",400,1000);
        }
        else{
            return null;    
        }
    }
}


