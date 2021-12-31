import java.util.Random;

/**
 * Класс кота
 */
public class Cat {

    private String name; // Имя кота
    private boolean satiety; // поле сытости
    private int howCanEats; // Сколько может кот съесть

    Random random = new Random();

    /**
     * Конструктор для создания кота
     * @param name
     */
    Cat(String name) {

        this.name = name;
        this.satiety = false;
        this.howCanEats = random.nextInt(25) + 5;

    }

    /**
     * Метод для того что бы кот мог поесть из тарелки
     * @param dish тарелка из которой будет есть кот
     */
    public void eat(Dish dish) {

        if (dish.food < this.howCanEats) {
            System.out.println("Для " + this.name + " в миске не хватает еды, заполните её");
        } else {
            dish.food -= this.howCanEats;
            this.satiety = true;
            System.out.println(this.name + " покушал, сытость, в миске осталось " + dish.food + " единиц еды.");
            if (dish.food < 20) {
                System.out.println("Миска почти опустела, не забудьте её пополнить.");
            }
        }

    }

    /**
     * Метод для вывода информации о сытости кота
     */
    public void isHungry() {
        System.out.println(this.name + " сытость : " + this.satiety);
    }

}
