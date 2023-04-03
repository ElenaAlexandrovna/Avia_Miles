public class Main {
    public static void main(String[] args) {

        int ticket = 28975; //стоимость билета
        int oneMile = 20; // стоимость 1 бонусной мили
        int bonus = ticket / oneMile;

        System.out.println("Начислено бонусных миль за билет:");
        System.out.println(bonus + " Ваши мили");
    }
}