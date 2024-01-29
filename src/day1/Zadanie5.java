package day1;

public class Zadanie5 {
    public static void main(String[] args) {
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

    }
}
