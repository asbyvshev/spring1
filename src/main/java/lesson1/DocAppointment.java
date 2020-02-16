package lesson1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("DocAppointment")
public class DocAppointment implements IDocAppointment {
    private Doctor doctor;

    @Autowired
    @Qualifier("GpDoctor")
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void appointment() {
        System.out.println("Вы записаны на прием!");
        doctor.processing();
    }
}
