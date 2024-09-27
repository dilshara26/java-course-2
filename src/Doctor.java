import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Doctor {
    Scanner scanner = new Scanner(System.in);
    public int doctorId;
    public String name;
    public String birthday;
    public String specialization;
    public String contactNumber;
    public ArrayList<Date> availabilities;

    public Doctor(int doctorId, String name, String birthday, String specialization, String contactNumber) {
        this.doctorId = doctorId;
        this.name = name;
        this.birthday = birthday;
        this.specialization = specialization;
        this.contactNumber = contactNumber;
        this.availabilities = new ArrayList<>();
    }

    public ArrayList<Date> getAvailabilities() {
        return availabilities;
    }

    public void setAvailabilities() {
        System.out.println("Enter the Day you want to add Availability: ");
        int day = scanner.nextInt();
        System.out.println("Enter the Month you want to add Availability: ");
        int month = scanner.nextInt();
        System.out.println("Enter the Year you want to add Availability: ");
        int year = scanner.nextInt();
        Date bookingDate = new Date(year,month,day);
        availabilities.add(bookingDate);

        for (Date d: availabilities) {
            System.out.println(d);
        }

    }


    public boolean isPhysician(){

        if(this.specialization.endsWith("physician")){
            return true;
        }
        return false;
    }


}
