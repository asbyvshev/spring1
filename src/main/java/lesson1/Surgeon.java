package lesson1;

public class Surgeon implements Doctor {
    @Override
    public void processing() {
        System.out.println("Вы на приеме у Хирурга!");
    }
}
