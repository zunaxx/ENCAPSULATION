package Task4;

import java.util.Arrays;

public class Phone {
    private String brand;
    private String model;
    private double price;
    private String phonesUserName;
    private Contact[] contacts;

    public Phone(String brand, String model, double price, String phonesUserName, Contact[] contacts) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.phonesUserName = phonesUserName;
        this.contacts = contacts;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getPhonesUserName() {
        return phonesUserName;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public int getContactCount() {
        return contacts.length;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", phonesUserName='" + phonesUserName + '\'' +
                ", contacts=" + Arrays.toString(contacts) +
                '}';
    }
}
