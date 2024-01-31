import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        System.out.println();
        System.out.println(task3());
        task4();
    }
    public static void doFirstHomework(){
        int intValue = 10;
        System.out.println("Значение переменной intValue с типом int равно " + intValue);
        byte by = 15;
        System.out.println("Значение переменной by с типом byte равно " + by);
        short sh = 5;
        System.out.println("Значение переменной sh с типом short равно " + sh);
        long lo = 100000L;
        System.out.println("Значение переменной lo с типом long равно " + lo);
        float fl = 12.5123F;
        System.out.println("Значение переменной fl с типом float равно " + fl);
        double d = 15.3;
        System.out.println("Значение переменной d с типом double равно " + d);
        char ch = 'B';
        System.out.println("Значение переменной ch с типом char равно " + ch);
        boolean bo = false;
        System.out.println("Значение переменной bo с типом boolean равно " + bo);

        int paintCan = 120;
        int whitePaint = 2;
        int brownPaint = 4;

        int cabinet = paintCan / (whitePaint + brownPaint);
        int sumWhitePaint = cabinet * whitePaint;
        int sumBrownPaint = cabinet * brownPaint;

        System.out.println("В школе,где " + cabinet + " классов, нужно " + sumWhitePaint + " банок белой краски и " + sumBrownPaint + " банок коричневой краски.");

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        int anualIncomeMasha = salaryMasha * 12;
        int anualIncomeDenis = salaryDenis * 12;
        int anualIncomeKristina = salaryKristina * 12;

        int increasedSalaryMasha = salaryMasha * 10 / 100 + salaryMasha;
        int increasedSalaryDenis = salaryDenis * 10 / 100 + salaryDenis;
        int increasedSalaryKristina = salaryKristina * 10 / 100 + salaryKristina;

        int incomeDiferenceMasha = increasedSalaryMasha * 12 - anualIncomeMasha;
        int incomeDiferenceDenis = increasedSalaryDenis * 12 - anualIncomeDenis;
        int incomeDiferenceKristina = increasedSalaryKristina * 12 - anualIncomeKristina;
        System.out.println("Маша теперь получает " + increasedSalaryMasha + " рублей. Годовой доход вырос на "
                + incomeDiferenceMasha + " рублей.");
        System.out.println("Денис теперь получает " + increasedSalaryDenis + " рублей. Годовой доход вырос на "
                + incomeDiferenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + increasedSalaryKristina + " рублей. Годовой доход вырос на "
                + incomeDiferenceKristina + " рублей.");

        int temperature = 4;

        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }

        int montNumber = 4;
        switch (montNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                if (montNumber > 12) {
                    System.out.println("Номер  больше 12");
                }
        }

        for (int i = 0; i < 17; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
            }
        }

        for(int i = 10; i > 0 ;i--) {
            System.out.print(i);
        }

        int money = 0;
        int cash = 15000;
        int month;

        while (money < 2459000){
            money = money + cash;
            month = money / cash;
            System.out.println("Месяц "+ month + " сумма накоплений равна " + money + " рублей.");
        }
    }

    public static void task1 () {
        System.out.println("Задача 1");
        Random random = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
        }
        System.out.println( Arrays.toString(arr));
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int number : arr) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
    }

    public static double task3 () {
        System.out.println("Задача 3");
        Random random = new Random();
        double[] array = new double[5];
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble(7);
            sum += array[i];
        }
        System.out.println(Arrays.toString(array));
        return sum;
    }

    static String concat(String[] stringArray){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < stringArray.length;i++){
            sb.append(stringArray[i]);
        }
        return sb.toString();
    }

    public static void task4 () {
        System.out.println("Задача 4");
        String[] stringArray = {"Hello", " ", "world"};
        System.out.println(concat(stringArray));
    }
}