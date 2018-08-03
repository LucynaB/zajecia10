package zad10_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ProductsRead {
    public static void main(String[] args) throws IOException {
        File file=null;
        Scanner scan=null;
        try{
            file = new File("produkty.csv");
            scan = new Scanner(file);
        }catch(FileNotFoundException e){
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
        System.out.println(Arrays.toString(products));

        System.out.println("Suma cen produktów: " + ProductOperation.priceSum(products));
        System.out.println("Najdroższy produkt: " + ProductOperation.mostExpensive(products));
        System.out.println("Najczęściej powtarzający się producent: "+ProductOperation.mostCommonProducer(products));


    }
}
