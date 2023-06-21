package com.startjava.lesson_2_3_4.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.setName("Akella");
        wolf.setAge(7);
        wolf.setColor("grey");
        wolf.setWeight(35);

        System.out.println("Имя волка " + wolf.getName() + "\nВозраст волка " + wolf.getAge() +
                "\nЦвет волка " + wolf.getColor() + "\nВес волка " + wolf.getWeight() + "\n");

        wolf.sit();
        wolf.walk();
        wolf.hunt();
        wolf.howl();
        wolf.run();
    }
}