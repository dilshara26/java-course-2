import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void mainMenu(){
        while (true){
            System.out.println("If you are a hospital administrator please press 1, If you are a patient please press 2, Press 3 to exit");
            int userType = scanner.nextInt();
            if (userType == 1) {
                adminMenu();
            } else if (userType == 2) {
                patientMenu();
            } else if (userType == 3) {
                break;

            } else {
                System.out.println("Invalid Input");
            }
        }
    }
    public static void adminMenu(){

        while(true){
            System.out.println("Press 1 to add a doctor, press 2 to add a doctor availability, and press 3 to exit ");
            int userObjective = scanner.nextInt();
            if (userObjective == 1) {
                Controllers.addDoctor();
                for (Doctor doc : Controllers.allDoctors) {
                    System.out.println(doc.name);
                }
            } else if (userObjective == 2) {
                System.out.println("Enter the Doctor Id you want to add the Availabilities: ");
                for (Doctor doc :Controllers.allDoctors) {
                    System.out.println("Doctor Name: " + doc.name + "   Doctor Id: " + doc.doctorId);
                }
                int docId = scanner.nextInt();
                Doctor selectedDoc = Controllers.getDoctorById(docId);
                if(selectedDoc != null){
                    selectedDoc.setAvailabilities();
                }
                else {
                    System.out.println("Wrong Doctor Id");
                }
            } else if (userObjective == 3) {
                break;
            } else {
                System.out.println("Invalid");
            }
        }
    }

    public static void patientMenu(){
        while (true){
            System.out.println("Press 1 to view doctors, press 2 to book an appointment, press 3 to view a selected doctor’s bookings, press 4 to register yourself,  and press 5 to exit");
            int userObjective = scanner.nextInt();
            if (userObjective == 1) {
                System.out.println("view doctors list");
            } else if (userObjective == 2) {
                System.out.println("Book an appointment");
            } else if (userObjective == 3) {
                System.out.println("View a selected Doctor");
            } else if (userObjective== 4 ) {
//                register a patient
                Controllers.addPatient();

            } else if (userObjective == 5) {
                break;

            } else {
                System.out.println("Invalid");
            }
        }

    }

}
