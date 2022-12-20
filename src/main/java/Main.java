import org.apache.log4j.Logger;
public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        String text = "I like Java!!!";

        logger.info(String.valueOf(text.charAt(text.length() -1)));
        logger.info(String.valueOf(text.endsWith("!!!")));
        logger.info(String.valueOf(text.startsWith("I like")));
        logger.info(String.valueOf(text.contains("Java")));
        logger.info(String.valueOf(text.indexOf("Java")));
        logger.info(text.replace("a", "o"));
        logger.info(text.toUpperCase());
        logger.info(text.toLowerCase());
        logger.info(text.substring(7, 11));

    }
}
