package gamifyyourlife.View;

import java.util.Scanner;

public class CommandsView {
    Scanner in = new Scanner(System.in); 
     public String nextC;
    
    public CommandsView(){
        
    }
       public void next(){
        System.out.println("Parancsok: ");
        System.out.println("Profil megtekintése: p ");
        System.out.println("Előzmények megtekintése: h ");
        System.out.println("Új feladat hozzáadása: n ");
        System.out.println("Feladat késznek jelölése: d ");
        System.out.println("Feladat törlése (Nem teljesítve): del ");
        System.out.println("Kilépés: ex ");
        System.out.print("A választott parancs: ");
        nextC = in.nextLine();
    }  
       
    public String getNextCommand(){
        return this.nextC.toLowerCase();
    }
    
    public void bye(){
        System.out.println("Kilépés. Viszlát!");
    }
    
    public void error(){
        System.out.println("Nincs ilyen parancs. Próbáljon az alábbiakból:");
    }
}
