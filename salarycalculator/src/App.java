import java.sql.SQLOutput;

public class App {
    public static void main (String[] args) {
     /*

        int n1 = 5;
        int n2 = 10;
        int result = n1 + n2;
        System.out.println(result);
      */

       /*int a = 3;

        int b = 4;
        int c = 5;
        int h = 4;
        int area = b * h / 2;
        int perimeter = a + b + c;
        System.out.println(perimeter);
        System.out.println(area);  */


        int brutosalary = 2000;
        int tax = 21;
        int withholding = (brutosalary * tax) / 100;
        int nettosalary = brutosalary - withholding;
        System.out.println(nettosalary);


    }
}