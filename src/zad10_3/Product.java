package zad10_3;

public class Product {
    private String nazwa;
    private String producer;
    private double price;

    public Product(String nazwa, String producer, double price) {
        this.nazwa = nazwa;
        this.producer = producer;
        this.price = price;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return nazwa+" "+producer+" "+price;
    }
}
