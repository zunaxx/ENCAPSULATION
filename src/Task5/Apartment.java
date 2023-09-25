package Task5;

public class Apartment {
    private String title;
    private double price;
    private String address;

    public Apartment(String title, double price, String address) {
        this.title = title;
        this.price = price;
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getAddress() {
        return address;
    }

    public void displayApartmentInfo() {
        System.out.println("Квартира: " + title);
        System.out.println("Цена: " + price + " сом");
        System.out.println("Адрес: " + address);
    }

    public double payPerMonth(Student[] students) {
        return price / students.length;
    }
}

