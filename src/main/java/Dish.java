/**
 * Класс тарелки
 */
public class Dish {


    private int size; // размер тарелки
    protected int food; // Количество еды в тарелке


    /**
     * Конструктор для создания тарелки
     * @param size объём тарелки
     */
    Dish(int size) {

        this.size = size;
        this.food = size;

    }

    /**
     * Метод для заполнения тарелки
     */
    public void addFood() {

        this.food = this.size;
        System.out.println("Миска пополнена теперь в ней " + this.food + " единиц еды.");

    }

}

