

        String[] input = new String[];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type in the expression: ");
        input = scanner.nextLine().split(",");

        System.out.println(calculate(input));
    }

    public static int calculate(String[] input) {

        // creating a string from the input to check if all the typed characters are correct
        String s = "";
        for (String value : input) {
            s = s.concat(value);
        }

        // Cleaning the input from special characters
        String character;
        String specialCharactersNumbers = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz,.;'[]\\=`~!@#$^&()_{}|\":<>?";
        for (int i = 0; i < specialCharactersNumbers.length(); i++) {
            character = "" + specialCharactersNumbers.charAt(i) + "";
            s = s.replace(character,"");
        }

        String[] inputElements = s.split(" ");

        // extracting the elements of input
        String operation = " ";
        int numA = 0;
        int numB= 0;

        if (Character.isDigit(inputElements[0].charAt(0)) && Character.isDigit(inputElements[1].charAt(0))) {
            numA = Integer.parseInt("" + inputElements[0] + "");
            numB = Integer.parseInt("" + inputElements[1] + "");
            operation = "" + inputElements[2] + "";
        } else if (!Character.isDigit(inputElements[0].charAt(0))) {
            numA = Integer.parseInt("" + inputElements[1] + "");
            numB = Integer.parseInt("" + inputElements[2] + "");
            operation = "" + inputElements[0] + "";
        } else if (!Character.isDigit(inputElements[1].charAt(0))) {
            numA = Integer.parseInt("" + inputElements[0] + "");
            numB = Integer.parseInt("" + inputElements[2] + "");
            operation = "" + inputElements[1] + "";
        } else {
            System.out.print("The input format should be: ");
            System.out.println(" operation number number");
            System.out.println("Try again!");
        }

        // calculating the result
        int result = 0;
        switch (operation) {
            case "+" -> result = numA + numB;
            case "-" -> result = numA - numB;
            case "*" -> result = numA * numB;
            case "/" -> result = numA / numB;
            case "%" -> result = numA % numB;
            default -> {
                System.out.print("The input format should be: ");
                System.out.println(" operation number number");
                System.out.println("Try again!");
            }
        }

        return result;
    }