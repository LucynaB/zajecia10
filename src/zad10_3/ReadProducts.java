package zad10_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadProducts {

    public static Product[] readProductsFromFile(String path) throws FileNotFoundException {
        File file = null;
        Scanner scan = null;

        try {
            file = new File(path);
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Plik nie istnieje.");
        }

        int fileLength = 0;
        while (scan.hasNextLine()) {
            scan.nextLine();
            fileLength++;
        }

        scan = new Scanner(file);
        Product[] products = new Product[fileLength];
        String line;
        int i = 0;
        while (scan.hasNextLine()) {
            line = scan.nextLine();
            String[] split = line.split(";");
            products[i] = new Product(split[0], split[1], Double.valueOf(split[2]));
            i++;
        }
        return products;
    }
}
