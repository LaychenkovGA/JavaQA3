public class Main2 {
    public static void main(String[] args) {

        int balans = 100;
        int popolnenie = 1100;

        int bonus;
        if (popolnenie >= 1000) {
            bonus = popolnenie / 100;
        } else {
            bonus = 0;
        }

        int itogo = (balans + popolnenie) + bonus;

        System.out.println("Начальный баланс на счету " + balans + " рублей");
        System.out.println("Пополнение счета на " + popolnenie + " рублей");
        System.out.println("Начислено дополнительно " + bonus + " рублей");
        System.out.println("Итого на балансе " + itogo + " рублей");
    }
}