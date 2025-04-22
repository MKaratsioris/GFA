package printable;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Domino> dominoes = new ArrayList<>();

        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(7, 1));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(6, 7));

        for(Domino item : dominoes) {
            item.printAllFields();
        }

        List<Todo> todoList = new ArrayList<>();

        todoList.add(new Todo("Buy milk", "high", true));
        todoList.add(new Todo("Buy Coca", "medium", false));
        todoList.add(new Todo("Study", "high", true));

        for(Todo item : todoList) {
            item.printAllFields();
        }

    }
}
