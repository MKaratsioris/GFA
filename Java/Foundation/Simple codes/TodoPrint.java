public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the `todoText`
        // Add " - Download games" to the end of the `todoText`
        // Add " - Diablo" to the end of the `todoText` applying indention

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        todoText = "My todo:".concat("\n").concat(todoText);
        todoText = todoText.concat(" - Download games").concat("\n");
        todoText = todoText.concat("    ").concat(" - Diablo");

        System.out.println(todoText);
    }
}