package tietokanta;

import java.util.Scanner;
import java.util.ArrayList;
 
public class Paaohjelma {
 
    public static void main(String[] args) {
        // HUOM! Älä luo ohjelmassa muita Scanner-olioita. Jos ja toivottavasti
        // kun teet muita luokkia, anna allaoleva Scanner-olio niille
        // tarvittaessa parametrina.
 
        Scanner lukija = new Scanner(System.in);
        Kayttoliittyma liittyma = new Kayttoliittyma();
        
        liittyma.kaynnista(lukija);
    }
 
}