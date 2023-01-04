import java.util.Scanner;
public class Methods {
    private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Main.class);
    static Scanner scanner = new Scanner(System.in);
    public static Integer num1, num2;

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public static int  plus (Integer num1, Integer num2){
        Integer result = null;
        logger.info("Adding " +num1+" to the " +num2);
        try {
            if ((num1==0 & num2==0) | (num1!=0 & num2==0)){
                throw new ArithmeticException("you cannot divide by zero");
            } else if (num1==0 & num2==0){
                throw new IllegalAccessException("you entered only zeros");
            } else if (num1<0 & num2<0) {
                throw new IllegalArgumentException("you entered negative numbers");
            } //else if (num1>0 & num2>0) {
            //throw new MyException("your numbers are valid");}
            else
                result = num1 + num2;
        } catch (ArithmeticException | NullPointerException | IllegalAccessException | IllegalArgumentException | MyException e){
            e.printStackTrace();
        }

        System.out.println("Result: " + result);
        return result;

    }
    public static int  minus (Integer num1, Integer num2){
        Integer result = null;
        logger.info("Subtracting " +num1+" from the " +num2);
        try {
            if ((num1==0 & num2==0) | (num1!=0 & num2==0)){
                throw new ArithmeticException("you cannot divide by zero");
            } else if (num1==0 & num2==0){
                throw new IllegalAccessException("you entered only zeros");
            } else if (num1<0 & num2<0) {
                throw new IllegalArgumentException("you entered negative numbers");
            }
            else
                result = num1 - num2;
        } catch (ArithmeticException | NullPointerException | IllegalAccessException | IllegalArgumentException e){
            e.printStackTrace();
        }

        System.out.println("Result: " + result);
        return result;

    }
    public static int  mult (Integer num1, Integer num2){
        Integer result = null;
        logger.info("Multipl " +num1+" on " +num2);
        try {
        if ((num1==0 & num2==0) | (num1!=0 & num2==0)){
            throw new ArithmeticException("you cannot divide by zero");
        } else if (num1==0 & num2==0){
            throw new IllegalAccessException("you entered only zeros");
        } else if (num1<0 & num2<0) {
            throw new IllegalArgumentException("you entered negative numbers");
        } else if (num1>0 & num2>0) {
        throw new MyException("your numbers are valid");}
        else
            result = num1*num2;
        } catch (ArithmeticException | NullPointerException | IllegalAccessException | IllegalArgumentException | MyException e){
        e.printStackTrace();
        }

        System.out.println("Result: " + result);
        return result;

   }
    public static Integer div (Integer num1, Integer num2){
        Integer result = null;
        logger.info("Divide " +num1+" on " +num2);
        try {
            if ((num1==0 & num2==0) | (num1!=0 & num2==0)){
                throw new ArithmeticException("you cannot divide by zero");
            } else if (num1==0 & num2==0){
                throw new IllegalAccessException("you entered only zeros");
            } else if (num1<0 & num2<0) {
                throw new IllegalArgumentException("you entered negative numbers");
            }
        else
            result = num1/num2;
        } catch (ArithmeticException | NullPointerException | IllegalAccessException | IllegalArgumentException e){
            e.printStackTrace();
        }

        System.out.println("Result: " + result);
        return result;
    }

}
