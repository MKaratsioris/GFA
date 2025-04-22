package cloneable;

public class Student extends Person implements Cloneable {
    String previousOrganization;
    int skippedDays;


    public Student() {
        previousOrganization = "The School of Life";
        skippedDays = 0;
    }

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " years old " + gender + "  from " + previousOrganization +
                " who skipped " + skippedDays + " days from the course already.");
    }

    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        Student john = new Student("John Doe", 20, "male", "BME");

        Student jonhTheClone = (Student)john.clone();

        john.introduce();
        jonhTheClone.introduce();
    }
}

