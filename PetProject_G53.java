/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petproject_g53;


/**
 *
 * @author yrudas
 */
public class PetProject_G53 {

    //Declaracion de atributos
    private static String petName = "Thomas";
    private static int age = 5;
    private static String healthStatus = "bien";
    private static int bornYear = 2020;
    private static String breed = "Sharpeir labrador";
    private static boolean pedigree = false;
    
    
    
    //Creacion del metodo que muestra los valores de los atributos
    public static void ShowPetInformation() {
    //Atajos: sout + TAB
    System.out.println(petName + " es un " + breed + " que tiene " + age + " años, nacio en el " + bornYear + " y se encuentra " + healthStatus + " de salud ");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
    
    ShowPetInformation();
    
    }
    
}
