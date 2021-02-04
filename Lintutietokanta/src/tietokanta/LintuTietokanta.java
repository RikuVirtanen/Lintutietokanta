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
import java.util.ArrayList;
 
public class LintuTietokanta {
    ArrayList<Lintu> linnut;
    
    public LintuTietokanta(){
        this.linnut = new ArrayList<>();
    }
    
    public void lisaa(String n, String l){
        Lintu lintu = new Lintu(n, l);
        linnut.add(lintu);
    }
    
    public void nayta(String n){
        for(Lintu lintu: linnut){
            if(lintu.getName().equals(n)){
                System.out.println(lintu.ToString());
            }else {
                System.out.println("Ei ole lintu!");
            }
        }
    }
    
    public void havainto(String n){
        for(Lintu lintu: linnut){
            if(lintu.getName().equals(n)){
                lintu.sighting();
            }else {
                System.out.println("Ei ole lintu!");
            }
        }
    }
    
    public void tilasto(){
        for(Lintu lintu: linnut){
            System.out.println(lintu.ToString());
        }
    }
}
