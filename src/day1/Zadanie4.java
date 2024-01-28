package day1;

public class Zadanie4 {
    public static void main(String[] args) {
        int temperature = 8;

        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }
    }
}
