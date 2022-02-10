package be.intecbrussel.bookExercises.chap6;

public class stringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("The quick brown fox jumped over the lazy dog.");
        StringBuilder sb2 = new StringBuilder("She sells seashells by the seashore.");

        System.out.println(sb1);
        System.out.println(sb2);

        sb1.append(" Silly fox.");
        System.out.println(sb1);

        sb2.reverse();
        System.out.println(sb2);

        //String space = " ";
        //String noSpace = \b;

        String str = sb1.toString();
        System.out.println(str.replaceAll("\\s", ""));


        //int index = sb2.indexOf("t");
        //char t = 't';
        //System.out.println(sb2.insert(index,t));

        for(int i = 0; i <sb2.length(); i++) {
            if (sb2.charAt(i) == 't') {
                sb2.insert(++i, 't');
            }
        }
        System.out.println(sb2);



    }
}
