package Task4;

public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact("John", "1234567890");
        Contact contact2 = new Contact("Alice", "9876543210");
        Contact contact3 = new Contact("Bob", "5555555555");
        Contact contact4 = new Contact("Eve", "9999999999");

        Contact[] contacts1 = {contact1, contact2};
        Contact[] contacts2 = {contact3, contact4};

        Phone phone1 = new Phone("Samsung", "Galaxy S21", 799.99, "User1", contacts1);
        Phone phone2 = new Phone("Apple", "iPhone 12", 899.99, "User2", contacts2);

        Phone[] phones = {phone1, phone2};

        for (Phone phone : phones) {
            System.out.println("У пользователя " + phone.getPhonesUserName() + " есть " + phone.getContactCount() + " контактов.");
            System.out.println("Список контактов:");
            for (Contact contact : phone.getContacts()) {
                System.out.println("Имя: " + contact.getContactName() + ", Телефон: " + contact.getPhoneNumber());
            }
            System.out.println();
        }
    }
}
