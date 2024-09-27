public class Patient {
    public String patientId;
    public String name;

    public String contactNumber;

    public Patient(String patientId, String name,String contactNumber) {

        this.patientId = patientId;
        this.name = name;

        this.contactNumber = contactNumber;
    }

    public char getPatientType(){
        return this.patientId.charAt(0);
    }

}