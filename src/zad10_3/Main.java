package zad10_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Product[] products = ReadProducts.readProductsFromFile("produkty.csv");
        System.out.println(Arrays.toString(products));

        System.out.println("Suma cen produktów: " + ProductOperation.priceSum(products));
        System.out.println("Najdroższy produkt: " + ProductOperation.mostExpensive(products));
        System.out.println("Najczęściej powtarzający się producent: " + ProductOperation.mostCommonProducer(products));


    }
}
