package GreenFoxInheritance;

public class Mentor extends Person {

    String level;


    public Mentor() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
        level = "intermediate";
    }

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public void introduce() {
            System.out.println("Hi, I'm " + name + ", a " + age + " years old " + gender + " " + level + " mentor.");
    }

    public void getGoal() {
        System.out.println("My goal is: Educate brilliant junior software developers.");
    }

}
