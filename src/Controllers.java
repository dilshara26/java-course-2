import javax.print.Doc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Controllers {
    public static ArrayList<Doctor> allDoctors = new ArrayList<>();
    public static ArrayList<Patient> allPatients = new ArrayList<>();


    public static void addDoctor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Enter your birthday: ");
        String birthday = sc.nextLine();
        System.out.println("Enter your Specialization: ");
        String specialization = sc.nextLine();
        System.out.println("Enter your Contact: ");
        String contact = sc.nextLine();

        Random random = new Random();
        Doctor tempDoctor = new Doctor(random.nextInt(), name, birthday,specialization,contact);
        allDoctors.add(tempDoctor);
    }

    public static Doctor getDoctorById(int id){
        for (Doctor doc: allDoctors) {
            if(doc.doctorId == id ){
                return  doc;
            }
        }

        return null;
    }
    public static void addPatient(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter patient Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter patient's Id: ");
        String id = scanner.nextLine();
        System.out.println("Enter patient's Contact Information: ");
        String contact = scanner.nextLine();
        Patient tempPatient = new Patient(id,name,contact);
        allPatients.add(tempPatient);
        System.out.println("Patient is Added");
    }


}
