/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petproject_V2;


/**
 *
 * @author yrudas
 */
public class PetProject_V2 {

    //Declaracion de atributos
    private static String petName = "Thomas";
    private static int age = 2;
    private static String healthStatus = "bien" ;
    private static int bornYear = 2020;
    private static String breed = "Sharpei labrador";
    private static boolean pedigree = true;
    private static char petSex = 'M';
    
    
    
    //Creacion del metodo que muestra los valores de los atributos
    public static void ShowPetInformation() {
    //Atajos: sout + TAB
    System.out.println(getPetName() + " es un " + getBreed()  + " que tiene " + getAge() + " años, nacio en el " + getBornYear() + " y se encuentra " + getHealthStatus() + " de salud ");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
    
    
    
    ShowPetInformation();
    
    }

    public static String getPetName() {
        return petName;
    }

    public static void setPetName(String PetName) {
        petName = PetName;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int Age) {
        age = Age;
    }

    public static String getHealthStatus() {
        return healthStatus;
    }

    public static void setHealthStatus(String HealthStatus) {
        healthStatus = HealthStatus;
    }

    public static int getBornYear() {
        return bornYear;
    }

    public static void setBornYear(int BornYear) {
        bornYear = BornYear;
    }

    public static String getBreed() {
        return breed;
    }

    public static void setBreed(String Breed) {
        breed = Breed;
    }

    public static boolean isPedigree() {
        return pedigree;
    }

    public static void setPedigree(boolean Pedigree) {
        pedigree = Pedigree;
    }

    public static char getPetSex() {
        return petSex;
    }

    public static void setPetSex(char PetSex) {
        petSex = PetSex;
    }

    
}
