public class Main {
    public static void main(String[] args) {
        int check = 100; // Начальный счет
        int repamount = 1100; // Сумма пополнения

        int bonus;
        if (repamount > 1000) {
            bonus = repamount / 100;
        } else {
            bonus = 0;
        }
        int afteramount = check + repamount + bonus; // Сумма на счету после пополнения
        System.out.println("Итого бонусных рублей " + bonus);
        System.out.println("Итоговая сумма на счету " + afteramount);

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
