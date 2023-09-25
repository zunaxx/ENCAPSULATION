package Task2;

public class StudentManager {
    private Student[] students;
    private int nextId; // Следующий доступный ID для нового студента

    public StudentManager(int maxSize) {
        students = new Student[maxSize];
        nextId = 1; // Исходный ID равен 1
    }

    public void addStudent(String firstName, String lastName, String email) {
        if (nextId <= students.length) {
            Student student = new Student(nextId, firstName, lastName, email);
            students[nextId - 1] = student; // -1, так как массивы начинаются с индекса 0
            nextId++;
        } else {
            System.out.println("Массив студентов заполнен.");
        }
    }

    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student != null && student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public void updateStudent(int id, String newFirstName, String newLastName, String newEmail) {
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (student != null && student.getId() == id) {
                student.setFirstName(newFirstName);
                student.setLastName(newLastName);
                student.setEmail(newEmail);
                break; // Найден студент, обновление выполнено, выходим из цикла
            }
        }
    }

    public void deleteStudent(int id) {
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (student != null && student.getId() == id) {
                students[i] = null; // Удаляем студента
                break; // Найден студент, удаление выполнено, выходим из цикла
            }
        }
    }

    public Student[] getAllStudents() {
        return students;
    }
}
