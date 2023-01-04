import java.util.InputMismatchException;
import java.util.Scanner;

public class Paired_or_not {
    private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Main.class);
    static Scanner scanner = new Scanner(System.in);
    public static int num1;
    public static void main(String[] args) {

        logger.info("enter number:");
        Integer result = null;

        while (num1 != 12345) {
            try {
                num1 = scanner.nextInt();
            }
            catch (InputMismatchException e){
                logger.error("String is entered");         /*как сделать так, чтоб программа даже после ввода символа
                                                          просто выкидывала экспепшн и дальше запроашивала ввод символа?*/
                throw new RuntimeException();
            }
            result = num1 % 2;
            if (result == 0)
                System.out.println("Your number is paired");
            else
                System.out.println("Your number is not paired");
        }
    }

}

