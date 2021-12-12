package Package;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Food[] breakfast = new Food[8];

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите блюдо");
            String food = scanner.nextLine();
            switch (food) {
                case "сыр" -> breakfast[i] = new Cheese();
                case "яблоко/большое" -> breakfast[i] = new Apple("большое");
                case "яблоко/маленькое" -> breakfast[i] = new Apple("маленькое");
                case "кофе/насыщенный" -> breakfast[i] = new Coffee("насыщенный");
                case "кофе/горький" -> breakfast[i] = new Coffee("горький");
                case "кофе/восточный" -> breakfast[i] = new Coffee("восточный");
                default ->  throw new IllegalArgumentException("invalid value");
            }
        }
        for (Food food : breakfast) {
            if (food != null)
                food.consume();
            else break;
        }

        int apple_counter = 0;
        int cheese_counter = 0;
        int coffee_counter = 0;
        for (int i = 0; i < 8; i++) {
            if (breakfast[i] instanceof Apple) {
                apple_counter++;
            } else if (breakfast[i] instanceof Cheese) {
                cheese_counter++;
            } else if (breakfast[i] instanceof Coffee) {
                coffee_counter++;
            }
        }
        System.out.println("CЫР - " + cheese_counter);
        System.out.println("ЯБЛОКО - " + apple_counter);
        System.out.println("КОФЕ - " + coffee_counter);
    }

}
