package PostIt;

public class Main {
    public static void main(String[] args) {
        PostIt idea = new PostIt();
        PostIt expression1 = new PostIt();
        PostIt expression2 = new PostIt();

        idea.backgroundColor = "orange";
        idea.text = "Idea 1";
        idea.textColor = "blue";

        expression1.backgroundColor = "pink";
        expression1.text = "Awesome";
        expression1.textColor = "black";

        expression2.backgroundColor = "yellow";
        expression2.text = "Superb!";
        expression2.textColor = "green";

    }
}
