package lesson1;

public class GpDoctor implements Doctor {
    @Override
    public void processing() {
        System.out.println("Вы на приеме у Терапевта!");
    }
}
