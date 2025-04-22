package TeachersStudents;

public class TeachersAndStudents {
    public static void main(String[] args) {

        Student michalis = new Student();
        Teacher lucia = new Teacher();

        michalis.question(lucia);
        lucia.teach(michalis);

    }
}
