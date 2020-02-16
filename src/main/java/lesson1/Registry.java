package lesson1;

public class Registry {
    public void registration(){
        DocAppointment docAppointment = new DocAppointment();
        Doctor doctor = new Surgeon();
        docAppointment.setDoctor(doctor);
        docAppointment.appointment();
    }
}
