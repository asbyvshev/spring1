package lesson1;

import org.springframework.stereotype.Component;

@Component("Surgeon")
public class Surgeon implements Doctor {
    private int office = 101;

    public int getOffice() {
        return office;
    }

    @Override
    public void processing() {
        System.out.format("Вас примет Хирург в кабенете № %d!",getOffice());
    }
}
