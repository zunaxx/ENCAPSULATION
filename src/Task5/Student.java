package Task5;

public class Student {
    private String fullName;
    private String phoneNumber;
    private String address;
    private String bankAccount;

    public Student(String fullName, String phoneNumber, String address, String bankAccount) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.bankAccount = bankAccount;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void changeInfo(String newFullName, String newPhoneNumber, String newAddress, String newBankAccount) {
        fullName = newFullName;
        phoneNumber = newPhoneNumber;
        address = newAddress;
        bankAccount = newBankAccount;
    }

    public void liveIn(Apartment apartment, Student[] students) {
        double monthlyPayment = apartment.payPerMonth(students);
        System.out.println(fullName + " может жить в квартире \"" + apartment.getTitle() +
                "\" по цене " + monthlyPayment + " сом в месяц.");
    }
}

