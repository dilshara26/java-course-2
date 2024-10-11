import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor(101, "John Smith", "1970-01-01", "Neurophysician", "123-456-7890");
        Doctor doctor2 = new Doctor(102, "Jane Doe", "1980-02-02", "Cardiologist", "987-654-3210");

        // Sample Patient objects
        Patient patient1 = new Patient("T-1234", "Alice Johnson",  "555-123-4567");
        Patient patient2 = new Patient("D-5678", "Bob Williams",  "888-789-0123");


        Controllers.allDoctors.add(doctor1);
        Controllers.allDoctors.add(doctor2);
        Controllers.allPatients.add(patient1);
        Controllers.allPatients.add(patient2);

        //  for Testing adding an availability for 02/03/2024
        doctor1.availabilities.add(new Date(2024,3,2));

        Menu.mainMenu();


//        // Sample Doctor objects
//        Doctor doctor1 = new Doctor(101, "John Smith", "1970-01-01", "Neurophysician", "123-456-7890");
//        Doctor doctor2 = new Doctor(102, "Jane Doe", "1980-02-02", "Cardiologist", "987-654-3210");
//

//        System.out.println(patient1.getPatientType());


    }
}