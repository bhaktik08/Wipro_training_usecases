package Day4_Assigement;

class Patient {
    private int id;
    private String name;
    private int age;
    private String illness;

    public Patient(int id, String name, int age, String illness) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.illness = illness;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    
    public String getIllness() {
        return illness;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name +
                ", Age: " + age + ", Illness: " + illness);
    }
}

interface PatientService {
 void registerPatient(Patient p);
 void showPatient(int id);
}

class PatientServiceImpl implements PatientService {

 private Patient[] patients = new Patient[10];
 private int count = 0;

 public void registerPatient(Patient p) {
     if (count < patients.length) {
         patients[count] = p;
         count++;
         System.out.println("Patient Registered");
     } else {
         System.out.println("Storage Full");
     }
 }

 public void showPatient(int id) {
     boolean found = false;

     for (int i = 0; i < count; i++) {
         if (patients[i].getId() == id) {
             patients[i].display();
             found = true;
             break;
         }
     }

     if (!found) {
         System.out.println("Patient not found");
     }
 }
}

abstract class Doctor {
 protected String name;
 protected String specialization;

 public Doctor(String name, String specialization) {
     this.name = name;
     this.specialization = specialization;
 }

 abstract void diagnose(Patient p);
}



class GeneralPhysician extends Doctor {

 public GeneralPhysician(String name) {
     super(name, "General");
 }

 void diagnose(Patient p) {
     System.out.println("Dr. " + name + " (General) treats " +
             p.getName() + " for " + p.getIllness());
 }
}


class Cardiologist extends Doctor {

 public Cardiologist(String name) {
     super(name, "Cardiology");
 }

 void diagnose(Patient p) {
     if (p.getIllness().equalsIgnoreCase("Heart")) {
         System.out.println("Dr. " + name + " (Cardiologist) treats heart patient " + p.getName());
     } else {
         System.out.println("Dr. " + name + " (Cardiologist) refers " +
                 p.getName() + " to General Physician");
     }
 }
}



public class HospitalApp {
	public static void main(String[] args) {

        
        PatientService service = new PatientServiceImpl();

       
        Patient p1 = new Patient(1, "Bhakti", 21, "Fever");
        Patient p2 = new Patient(2, "Rahul", 30, "Heart");

        
        service.registerPatient(p1);
        service.registerPatient(p2);

        
        service.showPatient(1);
        service.showPatient(2);

        
        Doctor d1 = new GeneralPhysician("Sharma");
        Doctor d2 = new Cardiologist("Mehta");

       
        d1.diagnose(p1);
        d1.diagnose(p2);
        
        d2.diagnose(p1);
        d2.diagnose(p2);
    }

}
