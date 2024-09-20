public class Patient {
    public String patientId;
    public String name;
    public String birthday;
    public String contactNumber;

    public Patient(String patientId, String name, String birthday, String contactNumber) {

        this.patientId = patientId;
        this.name = name;
        this.birthday = birthday;
        this.contactNumber = contactNumber;
    }

    public char getPatientType(){
        return this.patientId.charAt(0);
    }

}