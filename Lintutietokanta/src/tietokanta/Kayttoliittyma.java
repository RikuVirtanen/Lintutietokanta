package tietokanta;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author Riku
 */
import java.util.Scanner;
 
public class Kayttoliittyma extends Paaohjelma {
    
    LintuTietokanta kanta = new LintuTietokanta();
    
    public void kaynnista(Scanner lukija){
        while(true){
            System.out.println("? ");
            String komento = lukija.nextLine();
            
            if(komento.equals("Lisaa")||komento.equals("lisaa"))
                    
            {
                        
                System.out.print("Nimi: ");
                
                String n = lukija.nextLine();
                
                System.out.print("Latinankielinen nimi: ");
                
                String l = lukija.nextLine();
                
                kanta.lisaa(n, l);
                    
            }
                
            else if(komento.equals("Havainto")||komento.equals("havainto"))
            
            {
            
                System.out.println("Mikä havaittu? ");
                
                String n = lukija.nextLine();
                
                kanta.havainto(n);
                
            }
            
            else if(komento.equals("Tilasto")||komento.equals("tilasto"))
                
            {
                
                kanta.tilasto();
                
            }
            
            else if(komento.equals("Nayta")||komento.equals("nayta"))
            
            {
            
                System.out.println("Mikä? ");
                
                String n = lukija.nextLine();
                
                kanta.nayta(n);
                
            }
            
            else if(komento.equals("Lopeta")||komento.equals("lopeta")){
            
                break;
                
            }
 
        }
    }
                    
}
