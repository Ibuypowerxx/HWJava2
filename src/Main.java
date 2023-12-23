public class Main {
    public static void main(String[] args) {
        int check = 100; // Начальный счет
        int repAmount = 1100; // Сумма пополнения

        int bonus;
        if (repAmount > 1000) {
            bonus = repAmount / 100;
        } else {
            bonus = 0;
        }
        int afterAmount = check + repAmount + bonus; // Сумма на счету после пополнения
        System.out.println("Итого бонусных рублей " + bonus);
        System.out.println("Итоговая сумма на счету " + afterAmount);

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
