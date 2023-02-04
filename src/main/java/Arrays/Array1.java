package Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class Array1 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] resultArray = insertArrayElement();
        printElementsStartsWith(resultArray, "s");
        printElementsMoreThan(resultArray, 5);

    }
    public static String[] insertArrayElement(){

        String[] array = new String[5];
        String input;
        int i = 0;
        System.out.println("Enter some words: ");
        do {
            input = scanner.nextLine();
            array[i++] = input;
        } while (!input.equals("break"));

        System.out.println(Arrays.toString(array));
        return array;
    }
    public static void printElementsStartsWith (String[] array, String startsWithSymbol){

        for (String s : array) {
            if (s.startsWith(startsWithSymbol))
                System.out.println("Words start with S: " + s);

        }
        System.out.println();
    }
    public static void printElementsMoreThan (String[] array, int number){
        for (String s : array) {
            if (s.length() >= number) {
                System.out.println("Words has more 5: " + s);
            }
        }
        System.out.println();
    }
}
