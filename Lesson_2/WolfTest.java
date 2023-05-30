public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.name = "Akella";
        wolf.age = 10;
        wolf.color = "grey";
        wolf.weight = 40;

        System.out.println("Имя волка " + wolf.name + "\nВозраст волка " + wolf.age +
                "\nЦвет волка " + wolf.color + "\nВес волка " + wolf.weight + "\n");

        wolf.sit();
        wolf.walk();
        wolf.hunt();
        wolf.howl();
        wolf.run();
    }
}