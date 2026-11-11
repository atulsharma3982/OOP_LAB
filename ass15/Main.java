class Hospital{
    private final String hospitalName;
    private final String location;

    Hospital(String hospitalName, String location) {
        this.hospitalName = hospitalName;
        this.location = location;
    }

    void display() {
        System.out.println("----- Hospital Information -----");
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Location: " + location);
    }
}

class Doctor extends Hospital {
    private final int doctorID;
    private final String doctorName;
    private final String specialization;

    Doctor(String hospitalName, String location, int doctorID, String doctorName, String specialization) {
        super(hospitalName, location);
        this.doctorID = doctorID;
        this.doctorName = doctorName;
        this.specialization = specialization;
    }

    @Override 
    void display() {
        super.display();
        System.out.println("----- Doctor Information -----");
        System.out.println("Doctor ID: " + doctorID);
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Specialization: " + specialization);
    }

}

class Surgeon extends Doctor {
    private final String surgeryType;
    private final int optNumber;

    Surgeon(String hospitalName, String location, int doctorID, String doctorName, String specialization,
            String surgeryType, int optNumber) {
        super(hospitalName, location, doctorID, doctorName, specialization);
        this.surgeryType = surgeryType;
        this.optNumber = optNumber;
    }

    @Override 
    void display() {
        super.display();
        System.out.println("----- Surgeon Information -----");
        System.out.println("Surgery Type: " + surgeryType);
        System.out.println("Operation Theatre Number: " + optNumber);
    }
}

public class Main {
    public static void main(String[] args) {
        Surgeon s1 = new Surgeon("Apollo Hospital", "Kolkata", 101, "Dr. Anirban Sen", "Cardiology",
                "Heart Bypass Surgery", 3);
        s1.display();
    }
}