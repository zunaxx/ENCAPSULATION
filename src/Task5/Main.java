package Task5;

public class Main {
    public static void main(String[] args) {
        Apartment apartment1 = new Apartment("Квартира 1", 1000, "Адрес 1");
        Apartment apartment2 = new Apartment("Квартира 2", 1200, "Адрес 2");

        Student[] students = new Student[6];
        students[0] = new Student("Студент 1", "123456789", "Адрес 1", "1111-2222-3333-4444");
        students[1] = new Student("Студент 2", "987654321", "Адрес 1", "2222-3333-4444-5555");
        students[2] = new Student("Студент 3", "555555555", "Адрес 1", "3333-4444-5555-6666");
        students[3] = new Student("Студент 4", "111111111", "Адрес 2", "4444-5555-6666-7777");
        students[4] = new Student("Студент 5", "999999999", "Адрес 2", "5555-6666-7777-8888");
        students[5] = new Student("Студент 6", "777777777", "Адрес 2", "6666-7777-8888-9999");

        // Вывод информации о квартире и студентах в ней
        displayApartmentAndStudentsInfo("Адрес 1", apartment1, students);
        displayApartmentAndStudentsInfo("Адрес 2", apartment2, students);

        // Пересчитываем платежи для студентов в каждой квартире
        double paymentPerStudent1 = apartment1.payPerMonth(students);
        double paymentPerStudent2 = apartment2.payPerMonth(students);
        System.out.println("Стоимость проживания для студентов в Адресе 1: " + paymentPerStudent1 + " сом");
        System.out.println("Стоимость проживания для студентов в Адресе 2: " + paymentPerStudent2 + " сом");

        // Изменяем информацию о студентах
        students[0].changeInfo("Иван Иванов", "111111111", "Новый Адрес 1", "1111-2222-3333-4444");
        students[3].changeInfo("Петр Петров", "222222222", "Новый Адрес 2", "4444-5555-6666-7777");

        // Снова выводим информацию о квартире и студентах в ней
        displayApartmentAndStudentsInfo("Адрес 1", apartment1, students);
        displayApartmentAndStudentsInfo("Адрес 2", apartment2, students);

        // Пересчитываем платежи для студентов в каждой квартире после изменений
        double paymentPerStudent1Updated = apartment1.payPerMonth(students);
        double paymentPerStudent2Updated = apartment2.payPerMonth(students);
        System.out.println("Стоимость проживания для студентов в Адресе 1 (после изменений): " + paymentPerStudent1Updated + " сом");
        System.out.println("Стоимость проживания для студентов в Адресе 2 (после изменений): " + paymentPerStudent2Updated + " сом");
    }

    public static void displayApartmentAndStudentsInfo(String address, Apartment apartment, Student[] students) {
        System.out.println("Информация о квартире по адресу: " + address);
        apartment.displayApartmentInfo();

        System.out.println("Студенты в этой квартире:");
        for (Student student : students) {
            if (student.getAddress().equals(address)) {
                System.out.println(student.getFullName());
            }
        }
        System.out.println();
    }
}
