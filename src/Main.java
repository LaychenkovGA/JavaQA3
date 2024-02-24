public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int replenishment = 1100;

        int bonus;
        if (replenishment >= 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }

        int total = (balance + replenishment) + bonus;

        System.out.println("Начальный баланс на счету " + balance + " рублей");
        System.out.println("Пополнение счета на " + replenishment + " рублей");
        System.out.println("Начислено дополнительно " + bonus + " рублей");
        System.out.println("Итого на балансе " + total + " рублей");
    }
}