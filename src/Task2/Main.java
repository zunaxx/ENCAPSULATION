package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager(100); // Максимальный размер массива студентов

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить студента");
            System.out.println("2. Найти студента по ID");
            System.out.println("3. Обновить информацию о студенте");
            System.out.println("4. Удалить студента");
            System.out.println("5. Вывести всех студентов");
            System.out.println("0. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Введите имя студента:");
                    String firstName = scanner.nextLine();
                    System.out.println("Введите фамилию студента:");
                    String lastName = scanner.nextLine();
                    System.out.println("Введите email студента:");
                    String email = scanner.nextLine();
                    studentManager.addStudent(firstName, lastName, email);
                    System.out.println("Студент добавлен.");
                    break;
                case 2:
                    System.out.println("Введите ID студента:");
                    int studentId = scanner.nextInt();
                    scanner.nextLine();
                    Student foundStudent = studentManager.findStudentById(studentId);
                    if (foundStudent != null) {
                        System.out.println("Найден студент:");
                        System.out.println(foundStudent.toString());
                    } else {
                        System.out.println("Студент не найден.");
                    }
                    break;
                case 3:
                    System.out.println("Введите ID студента для обновления:");
                    int studentIdToUpdate = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Введите новое имя:");
                    String newFirstName = scanner.nextLine();
                    System.out.println("Введите новую фамилию:");
                    String newLastName = scanner.nextLine();
                    System.out.println("Введите новый email:");
                    String newEmail = scanner.nextLine();
                    studentManager.updateStudent(studentIdToUpdate, newFirstName, newLastName, newEmail);
                    System.out.println("Информация о студенте обновлена.");
                    break;
                case 4:
                    System.out.println("Введите ID студента для удаления:");
                    int studentIdToDelete = scanner.nextInt();
                    scanner.nextLine();
                    studentManager.deleteStudent(studentIdToDelete);
                    System.out.println("Студент удален.");
                    break;
                case 5:
                    Student[] allStudents = studentManager.getAllStudents();
                    System.out.println("Список всех студентов:");
                    for (Student student : allStudents) {
                        if (student != null) {
                            System.out.println(student.toString());
                        }
                    }
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    System.exit(0);
                default:
                    System.out.println("Неправильный выбор. Попробуйте еще раз.");
            }
        }
    }
}

