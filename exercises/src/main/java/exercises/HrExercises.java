package exercises;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class HrExercises {

    /*
    * Cada estudiante tiene una calificacion de 0 a 100, y 40 es reprobado.
    * * Si la calificacion es menor a 38, no se redondea.
    * * Si la calificacion es mayor a 38, se redondea al siguiente multiplo de 5.
    * **/
    public static List<Integer> gradingStudents(List<Integer> grades) {
        return grades.stream().map(grade -> {
            if (grade >= 38 && grade % 5 >= 3){
                return grade + (5 - (grade % 5));
            } else {
                return grade;
            }
        }).toList();
    }

    /*
    * Dado el numero de manzanas y naranjas que cayeron en una casa,
    * se debe calcular cuantas manzanas y naranjas cayeron en el rango de s a t.
    *
    * s: entero, inicio del rango
    * t: entero, fin del rango
    * a: entero, posicion de la manzana
    * b: entero, posicion de la naranja
    * apples: lista de enteros, manzanas
    * oranges: lista de enteros, naranjas
    * */
    public static String countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        int appleCount = 0;
        int orangeCount = 0;

        appleCount = (int) apples.stream().filter(apple -> apple + a >= s && apple + a <= t).count();
        System.out.println(appleCount);

        orangeCount = (int) oranges.stream().filter(orange -> orange + b >= s && orange + b <= t).count();
        System.out.println(orangeCount);

        return appleCount + " " + orangeCount;
    }

    /*
    * Number Line Jumps
    * *
    * **/
    public static String kangaroo(int x1, int v1, int x2, int v2) {


        return "YES";
    }

    public static void main(String[] args) {
        System.out.println("*************** Hello CesarLead!!! ***************");

    }
}
