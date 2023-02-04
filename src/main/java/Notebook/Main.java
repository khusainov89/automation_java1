package Notebook;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Notebook> notebooks = new ArrayList<Notebook>();
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Enums.Main.class);
        Scanner scanner = new Scanner(System.in);

        boolean isRun = true;

        while (isRun){
            logger.info("Enter model:");
            String model = scanner.next();
            if (model.equalsIgnoreCase("stop")){
                break;
            }
            logger.info("Enter price");
            int price = scanner.nextInt();
            Notebook notebook = new Notebook(model, price);
            notebooks.add(notebook);
        }
        for (Notebook n: notebooks) {
            logger.info("Model: " + n.getModel() + " Price: " + n.getPrice());
            System.out.println();
        }

        Notebook.getMaxPrice(notebooks);
        Notebook.printMacPrice(notebooks);
    }
}

