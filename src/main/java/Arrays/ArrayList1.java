package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ArrayList1 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<String> resultarrayList = insertArrayListElement();
        printElementsStartsWith2(resultarrayList, "s");
        printElementsMoreThan2(resultarrayList, 5);
    }
    public static List<String> insertArrayListElement() {

        List<String> arrayList = new ArrayList<>();
        String input;
        System.out.println("Enter some words: ");
        do {
            input = scanner.nextLine();
            arrayList.add(input);
        } while (!input.equals("break"));
        System.out.println(arrayList);
        System.out.println();
        return arrayList;
    }
        public static void printElementsStartsWith2 (List<String> resultarrayList, String startsWithSymbol){
        List<String> wordsWithS = new ArrayList<>();
        for (String s : resultarrayList) {
            if (s.startsWith(startsWithSymbol)) {
                wordsWithS.add(s);
            }
        }
        System.out.println("Words start with S: " + wordsWithS);
        System.out.println();
    }
    public static void printElementsMoreThan2 (List<String> resultarrayList, int number){
        List<String> wordsMore5 = new ArrayList<>();
        for (String s : resultarrayList) {
            if (s.length() >= number) {
                wordsMore5.add(s);
            }
        }
        System.out.println("Words has more 5: " + wordsMore5);
    }
}


