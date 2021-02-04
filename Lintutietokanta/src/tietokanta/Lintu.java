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
public class Lintu {
    private String name;
    private String latName;
    private int sighting;
    
    public Lintu(){
        this.name = "nameless";
        this.latName = "innominatam";
        this.sighting = 0;
    }
    
    public Lintu(String n, String l){
        this.name = n;
        this.latName = l;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void sighting(){
        this.sighting++;
    }
    
    public String ToString(){
        return this.name + " (" + this.latName + "): " + this.sighting + " havaintoa";
    }
}
