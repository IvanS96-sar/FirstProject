package day1;

public class Zadanie3 {
    public static void main(String[] args) {
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
        System.out.println("Маша теперь получает " + increasedSalaryMasha + " рублей. Годовой доход вырос на " + incomeDiferenceMasha + " рублей.");
        System.out.println("Денис теперь получает " + increasedSalaryDenis + " рублей. Годовой доход вырос на " + incomeDiferenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + increasedSalaryKristina + " рублей. Годовой доход вырос на " + incomeDiferenceKristina + " рублей.");
    }
}
