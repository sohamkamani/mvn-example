package com.sohamkamani;

import com.github.ricksbrown.cowsay.Cowsay;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        int result = Calculator.add(4, 5);
        String[] cowArgs = new String[] {String.valueOf(result)};
        String cowString = Cowsay.say(cowArgs);
        System.out.printf(cowString);
    }

    static void printCommandLineArgs(String[] args) {
        // first, we should check if the user has provided the correct number of arguments
        if (args.length != 2) {
            // if not, we should print a usage message and exit
            System.out.println(
                    "Usage: java -jar target/cowsay-1.0-SNAPSHOT.jar \"quote\" \"author\"");
            System.exit(1);
        }
        String quote = args[0];
        String author = args[1];
        String[] cowArgs = new String[] {quote, " --" + author};
        String cowString = Cowsay.say(cowArgs);
        System.out.printf(cowString);
    }

}
