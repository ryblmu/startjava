public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger = new Jaeger();
        Jaeger jaeger2 = new Jaeger("Gipsy Danger", "Mark - 3", 79.25f, 1.980f, 7, 8, 6);

        jaeger.setModelName("Cherno Alpha");
        jaeger.setMark("Mark-1");
        jaeger.setHeight(85.34f);
        jaeger.setWeight(2.412f);
        jaeger.setSpeed(3);
        jaeger.setStrength(10);
        jaeger.setArmor(10);

        System.out.println("Название первого робота " + jaeger.getModelName() + 
                "\nНазвание второго робота " + jaeger2.getModelName());

        System.out.println("Скорость первого робота больше второго? " +
                (jaeger.getSpeed() > jaeger2.getSpeed()));

        System.out.println(jaeger.getModelName()+ " " + jaeger.useVortexCannon() + " на скорости " +
                jaeger.getSpeed());
    }
}