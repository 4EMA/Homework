package day17;

public class homework2<name> {
    //part4, as homework
    //USING TWO LOOP print names and surnames
    //ex:
    //Bayram Guney
    //Micheal Jackson
    public static void main(String[] args) {
        //part1
        String[][] s = {
                //   0         1         2           3            4
                {"Bayram", "Zeynep", "Sezai", "Micheal", "Baraka"}, //0. row
                {"Guney", "Ucar", "Kalayci", "Jackson", "Obama"},   //1. row
        };

        //part2
        System.out.println(s[0][0] + " " + s[1][0]);
        System.out.println(s[0][3] + " " + s[1][3]);

        //part3
        //using only one loop print names and surnames
//        ex:
//        Bayram Guney
//        Micheal Jackson

        //         for(int a=0; a>s.length;a++);//my code

        //   System.out.println(s[0][1] + " "+s[1][1] ); my code

        for (int i = 0; i < s[0].length; i++) {
            for (int j = 0; j < s[0].length -1; j++) {

            }
            System.out.println(s[0][i] + " " + s[1][i]);

        }
    }
}

