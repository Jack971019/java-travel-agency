package Org.Java.Lessons.Travel.Agency;

import java.time.LocalDate;
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
                System.out.println("where do you wanto to go?");
                String destination = scan.nextLine();
                System.out.println("When do you wanto to leave? yyyy-MM-dd");
                LocalDate dayOfStart = LocalDate.parse(scan.nextLine());
                System.out.println("when do you want to go back home? yyyy-MM-dd");
                LocalDate dayOfEnd = LocalDate.parse(scan.nextLine());
                break;

            } else if (usereAnswer.equalsIgnoreCase("N")) {
                System.out.println("Thanks for choosing us to book your vacancy");
                break;
            } else {
                System.out.println("sorry choose a valid option");
            }

            vacancy = new Vacancy(vacancy.getDestination(), vacancy.getDayOfStart(), vacancy.getDayOfEnd());
            System.out.println(vacancy);
        }

        System.out.println();

    }

}
