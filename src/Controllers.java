import javax.print.Doc;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Controllers {
    public ArrayList<Doctor> allDoctors = new ArrayList<>();

    public void addDoctor(){
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
}
