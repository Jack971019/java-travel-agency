package Org.Java.Lessons.Travel.Agency;

import java.util.Scanner;

public class Agency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Vacancy vacancy = null;

        while (vacancy == null){
            // CHIEDO ALL'UTENTE SE VUOLE SCEGLIERE UNA NUOVA VACANZA
            System.out.println("do you wanto to choose a vacancy?  Y/N");
            String usereAnswer = scan.nextLine();

            if (usereAnswer.equalsIgnoreCase("Y")){

            } else if (usereAnswer.equalsIgnoreCase("N")) {
                System.out.println("Thanks for choosing us to book your vacancy");
                break;
            } else {
                System.out.println("sorry choose a valid option");
            }
        }

    }

}
