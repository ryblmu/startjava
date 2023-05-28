class MyFirstGame {

    public static void main(String[] args) {
        int unknownNum = 50;
        int userNum = 60;

        while (userNum != unknownNum) {
            if (userNum < unknownNum) {
                System.out.println("Число " + userNum + " меньше того, что загадал компьютер");
                userNum += 1;
            } else {
                System.out.println("Число " + userNum + " больше того, что загадал компьютер");
                userNum -= 1;
            }
        }

        System.out.println("Вы победили ! загаданное число " + userNum);
    }
}