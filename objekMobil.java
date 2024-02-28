/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

/**
 *
 * @author KOMPUTER JARKOM 30
 */
public class objekMobil {
    
    public static void main(String[] args) {
        MobilDiesel md = new MobilDiesel ("Toyota", 200, 0, "solar");
        MobilBensin mb = new MobilBensin ("Toyota", 200, 0, "solar");
        
        md.infoMobilDiesel();
        mb.infoMobilBensin();
        
    }
}