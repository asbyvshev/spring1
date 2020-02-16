package lesson1;

public class DocAppointment {
    private Doctor doctor;

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void appointment() {
        System.out.println("Вы записаны на прием!");
        doctor.processing();
    }
}
