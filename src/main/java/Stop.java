import org.apache.log4j.Logger;

import java.util.Scanner;

public class Stop {
    private static final Logger logger = Logger.getLogger(Stop.class);
    public static void main(String[] args) {

        String word = "";
        String max_word = word;
        String min_word = word;
        int count = 0;
        int max_count = 0;
        int min_count = 0;

        Scanner scanner = new Scanner(System.in);

        while (!word.equalsIgnoreCase("stop")) {

            logger.info("Input some words: ");

            word = scanner.nextLine();

            logger.info("user entered: " + word);

            count ++;

            if (word.length() > max_word.length()) {
                max_word = word;
                max_count = count;
            }
//            else if (word.length() > 0 || word.length() < min_word.length())

            else{
                min_word = word;
                min_count = count;
            }
            logger.info("The longer word is:" + max_word);
            logger.info("The length of the longer word is: " + max_word.length());
            logger.info("The number of the highest number is: " + max_count);
            logger.info("The shorter word is: " + min_word);
            logger.info("The length of the shorter word is: " + min_word.length());
            logger.info("The number of the smallest number is: " + min_count);
        }

    }
}
