package BeforeInheritance;

public class Mentor {

    String name;
    String gender;
    String level;
    int age;

    public Mentor() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
        level = "intermediate";
    }

    public Mentor(String name, int age, String gender, String level) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.level = level;
    }

    public void introduce() {
            System.out.println("Hi, I'm " + name + ", a " + age + " years old " + gender + " " + level + " mentor.");
    }

    public void getGoal() {
        System.out.println("My goal is: Educate brilliant junior software developers.");
    }

}
