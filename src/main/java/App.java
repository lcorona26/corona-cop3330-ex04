/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Corona
 */
import java.util.Scanner;

/*
Exercise 4 - Mad Lib
Mad libs are a simple game where you create a story template with blanks for words. You, or another player, then construct a list of words and place them into the story, creating an often silly or funny story as a result.

Create a simple mad-lib program that prompts for a noun, a verb, an adverb, and an adjective and injects those into a story that you create.

Example Output
Enter a noun: dog
Enter a verb: walk
Enter an adjective: blue
Enter an adverb: quickly
Do you walk your blue dog quickly? That's hilarious!

Constraints
Use a single output statement for this program.
If your language supports string interpolation or string substitution, use it to build up the output.

 */
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        App app = new App();
        String noun =app.readNoun();
        String verb =app.readVerb();
        String adjective =app.readAdjective();
        String adverb = app.readAdverb();
        app.printOutput(noun, verb, adjective, adverb);
    }

    private void printOutput(String noun, String verb, String adjective, String adverb) {
        String message = String.format("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);
        System.out.println(message);
    }

    private String readNoun() {
        System.out.print("Enter a noun: ");
        String noun = in.nextLine();
        return noun;
    }
    private String readVerb() {
        System.out.print("Enter a verb: ");
        String adjective = in.nextLine();
        return adjective;
    }

    private String readAdjective() {
        System.out.print("Enter an adjective: ");
        String verb = in.nextLine();
        return verb;
    }
    private String readAdverb() {
        System.out.print("Enter an adverb: ");
        String adverb = in.nextLine();
        return adverb;
    }
}
