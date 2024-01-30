package day1;

public class Zadanie8 {
    public static void main(String[] args) {
        int money = 0;
        int cash = 15000;
        int month;

        while (money < 2459000){
            money = money + cash;
            month = money / cash;
            System.out.println("Месяц "+ month + " сумма накоплений равна " + money + " рублей.");
        }
    }
}
