public class Main {
    public static void main(String[] args) {
        int initialBalance = 100;
        int refillAmount = 1100;
        int bonus;
        if (refillAmount > 1000) {
            bonus = refillAmount / 100;
        } else {
            bonus = 0;
        }

        int totalAmount = (initialBalance + refillAmount + bonus);

        System.out.println("Final balance:" + totalAmount);
        System.out.println("Bonus:" + bonus);
    }
}