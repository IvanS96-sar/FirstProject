import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        System.out.println(sum(5));
        System.out.println("Задача 2");
        System.out.println(getFactorial(5));
        System.out.println("Задача 3");
        System.out.println(getFibonacci(7));
        System.out.println("Задача 4");
        wrap();
        System.out.println("Задача 5");
        arithmeticOperations();
        System.out.println("Задача 6");
        comparison();
        System.out.println("Задача 7");
        checkTimeWithPrimitive();
        System.out.println();
        checkTimeWithWrapper();
        System.out.println("Задача 8");
        maxMinZnach();
    }
    public static int sum(int num) {
        if (num < 1) {
            return 0;
        } else {
            return num + sum(num - 1);
        }
    }

    public static int getFactorial(int f) {
        if (f <= 1) {
            return 1;
        } else {
            return f * getFactorial(f - 1);
        }
    }

    public static int getFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }  else {
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }
    }

    public static void wrap(){
        int inValue = 6;
        Integer x = inValue;
        System.out.println("Примитивный тип равен " + inValue + ", упакованный объект равен " + x + ".");

        double d = 10.2;
        Double dou = d;
        System.out.println("Примитивный тип равен " + d + ", упакованный объект равен " + dou + ".");
        boolean b = true;
        Boolean bo = b;
        System.out.println("Примитивный тип равен " + b + ", упакованный объект равен " + bo + ".");
    }

    public static void arithmeticOperations(){
        int a = 5;
        Integer integer = 10;
        int sum = a + integer;
        System.out.println(sum);

        double d = 11.8;
        Double doo = 5.8;
        double rest = d - doo;
        System.out.println(rest);
    }

    public static void comparison(){
        Integer a = 6;
        Integer b = 6;
        System.out.println(a == b);
        System.out.println(a.equals(b));

        System.out.println("За пределами диапазона от -128 и 127");

        Integer in = -129;
        Integer c = -129;
        System.out.println(in == c);
        System.out.println(in.equals(c));
    }

    public static void checkTimeWithPrimitive(){
        long startTime = System.currentTimeMillis();
        int sum = 0;
        int in = 0;
        while (in < 10_000_000){
            in++;
            sum += in;
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Время выполнения операции: " + duration + " миллисекунд");
    }
    public static void checkTimeWithWrapper(){
        long startTime = System.currentTimeMillis();
        Integer sum = 0;
        for (int i = 0; i < 10_000_000; i++){
            sum += i;
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Время выполнения операции: " + duration + " миллисекунд");
    }

    public static void maxMinZnach(){
        Integer i = Integer.MAX_VALUE;
        System.out.println(i);
        i++;
        System.out.println(i);
        Integer inValue = Integer.MIN_VALUE;
        System.out.println(inValue);
        inValue--;
        System.out.println(inValue);

        System.out.println();

        Long l = Long.MAX_VALUE;
        System.out.println(l);
        l++;
        System.out.println(l);
        Long lo = Long.MIN_VALUE;
        System.out.println(lo);
        lo--;
        System.out.println(lo);
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