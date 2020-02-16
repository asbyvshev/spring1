package lesson1;

public class GpDoctor implements Doctor {
    private int office = 321;

    public int getOffice() {
        return office;
    }

    @Override
    public void processing() {
        System.out.format("Вас примет Терапевт в кабенете № %d!",getOffice());
    }
}
