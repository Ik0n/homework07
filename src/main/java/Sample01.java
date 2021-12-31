/**
 * Основной класс
 */
public class Sample01 {

    /**
     * Точка входа в программу
     * @param args
     */
    public static void main(String[] args) {

        Cat[] cats = new Cat[5];

        cats[0] = new Cat("Барсик");
        cats[1] = new Cat("Персик");
        cats[2] = new Cat("Снежок");
        cats[3] = new Cat("Уголёк");
        cats[4] = new Cat("Рыжик");

        Dish dish = new Dish(50);

        for (Cat cat : cats) {
            cat.eat(dish);
        }

        for (Cat cat : cats) {
            cat.isHungry();
        }

        dish.addFood();

    }

}
