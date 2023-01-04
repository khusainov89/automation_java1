import java.util.InputMismatchException;
import java.util.Scanner;
public class Sum_result {
    private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Main.class);
    static Scanner scanner = new Scanner(System.in);
    public static int num1, num2, result;                 /*как сделать так, чтоб программа даже после ввода символа
                                                          просто выкидывала экспепшн и дальше запроашивала ввод символа?*/
    public void summa() {
        try {
                logger.info("enter first number:");
                num1 = scanner.nextInt();
                logger.info("enter second number:");
                num2 = scanner.nextInt();
                result = num1 + num2;
        }
        catch (InputMismatchException e){
                e.printStackTrace();
                logger.error("Invalid value is entered");
        }
            logger.info("Result: " + result);
    }
}



