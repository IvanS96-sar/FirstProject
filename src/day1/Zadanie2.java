package day1;

public class Zadanie2 {
    public static void main(String[] args) {
        int paintCan = 120;
        int whitePaint = 2;
        int brownPaint = 4;

        int cabinet = paintCan / (whitePaint + brownPaint);
        int sumWhitePaint = cabinet * whitePaint;
        int sumBrownPaint = cabinet * brownPaint;

        System.out.println("В школе,где " + cabinet + " классов, нужно " + sumWhitePaint + " банок белой краски и " + sumBrownPaint + " банок коричневой краски.");
    }
}
