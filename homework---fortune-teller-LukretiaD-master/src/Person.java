public class Person {

    public void personInfo() throws InterruptedException {

        KeyboardInputs key = new KeyboardInputs();

        String first = key.getStringValue("What is your First Name?");
        if ((first.length() > 50)) {
            System.out.println("Sorry, must be 50 characters or less!");
        } else {

            System.out.println("Thank you, " + first);
            System.out.println();
            System.out.println();
        }

        String last = key.getStringValue("Now, what is your Last Name, " + first);
        if ((last.length() > 50)) {
            System.out.println("Sorry, must be 50 characters or less!");
        } else {

            System.out.println("Ah! Wonderfully done " + first);
            System.out.println();
        }

        int ageInt = key.getIntegerValue("What is your age?");
        if (ageInt >= 0 && ageInt <= 130) {
            System.out.println("Ah!. . .Thank You!");
            System.out.println();
        } else {

            System.out.println("Nope, You must put your age to get your fortune");
        }

        int birthDay = key.getIntegerValue("Please provide the number of your birthday month.");
        if (birthDay >= 1 && birthDay <= 12) {
            System.out.println("Great! We are almost there!");
            System.out.println();
        } else {

            System.out.println("Nope, must be between 1-12. 1 being January to 12 being Decemeber.");
        }

        int siblings = key.getIntegerValue("How many siblings do you have?");
        if (siblings >= 0 && siblings <= 13) {

            System.out.println("Great!");
            System.out.println();
        } else {

            System.out.println("Sorry, please choose between 0 and 13.");

        }

        System.out.println("Last question . . . .");
        System.out.println();
        String color = key.getStringValue(
                "What is your favorite ROYGBIV color? If your not sure of what ROYGBIV is, enter the word 'Help' for help.");
        System.out.println("Really? Thats my favorite color too!");
        System.out.println();

        System.out.println("Alright. . . Now your fortune. . . . ");
        System.out.println();
        System.out.println(first + last);
        System.out.println();
        System.out.println("You will retire in 12 years with $256,000.76 in the bank. . . ");
        System.out.println("A vacation home in Nassau Bahamas. . .");
        System.out.println("And travel by motor scooter");
        System.out.println();

        switch (color) {
            case "Help": {
                System.out.println("Help: The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.");
                System.out.println();
                break;
            }

        }

    }
}
