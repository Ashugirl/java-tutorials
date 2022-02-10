package be.intecbrussel.bookExercises.chap6;

public class Formatter {
    public static void main(String[] args) {
        double meter = 1;
        double half = .5;
        while(meter<=20){
            double foot = meter * 3.28;
            System.out.printf("%.2f meter = %.2f feet %n", meter, foot);
            meter = meter + half;
        }

    }
}
