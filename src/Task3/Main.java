package Task3;

public class Main {

    public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0] = new Student("Student 1", 25, "JAVA");
        students[1] = new Student("Student 2", 22, "JS");
        students[2] = new Student("Student 3", 28, "JAVA");
        students[3] = new Student("Student 4", 20, "JS");
        students[4] = new Student("Student 5", 23, "JAVA");

        int javaStudentsCount = 0;
        int jsStudentsCount = 0;
        int totalAge = 0;

        for (Student student : students) {
            if ("JAVA".equals(student.getGroup())) {
                javaStudentsCount++;
            } else if ("JS".equals(student.getGroup())) {
                jsStudentsCount++;
            }

            totalAge += student.getAge();
        }

        System.out.println("Количество студентов в группе 'JAVA': " + javaStudentsCount);
        System.out.println("Количество студентов в группе 'JS': " + jsStudentsCount);

        if (students.length > 0) {
            double averageAge = (double) totalAge / students.length;
            System.out.println("Средний возраст студентов: " + averageAge);
        } else {
            System.out.println("Нет студентов для расчета среднего возраста.");
        }
    }
}

