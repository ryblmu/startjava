class MyFirstGame {

    public static void main(String[] args) {
        int unknownNum = 50;
        int playerNum = 60;

        while (playerNum != unknownNum) {
            if (playerNum < unknownNum) {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
                playerNum++;
            } else {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
                playerNum--;
            }
        }

        System.out.println("Вы победили ! загаданное число " + playerNum);
    }
}