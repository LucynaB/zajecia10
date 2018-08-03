package zad10_3;


public class ProductOperation {


    public static double priceSum(Product[] products) {
        double sum = 0;
        for (int i = 0; i < products.length; i++) {
            sum += products[i].getPrice();
        }
        return sum;
    }

    public static Product mostExpensive(Product[] products) {
        Product mostExpensive = products[0];
        for (int i = 0; i < products.length; i++) {
            if (products[i].getPrice() > mostExpensive.getPrice()) {
                mostExpensive = products[i];
            }
        }
        return mostExpensive;
    }

    public static String mostCommonProducer(Product[] products) {
        String producer = null;
        int[] count = new int[products.length];
        for (int i = 0; i < products.length; i++) {
            producer = products[i].getProducer();
            int licz = 0;

            for (int j = 0; j < products.length; j++) {
                if (products[j].getProducer().equals(producer)) {
                    licz++;
                }
                count[i] = licz;
            }
        }

        if (getMaxIndex(count) > 1) {
            return products[getMaxIndex(count)].getProducer();
        } else
            return "Każdy producent występuje raz.";
    }

    public static int getMaxIndex(int[] table) {
        int maxIndex = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i] > maxIndex) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
