import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = input.nextLine();

        System.out.print("Enter a verb: ");
        String verb = input.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine();

        System.out.print("Enter an adverb: ");
        String adverb = input.nextLine();

        // more inputs to expand the story
        System.out.print("Enter another noun: ");
        String noun2 = input.nextLine();

        System.out.print("Enter another verb: ");
        String verb2 = input.nextLine();

        System.out.print("Enter another adjective: ");
        String adjective2 = input.nextLine();

        System.out.print("Enter another adverb: ");
        String adverb2 = input.nextLine();

        String str = String.format("Do you %s your %s %s %s? And you also %s you %s %s %s? That's hilarious!", verb, adjective, noun, adverb, verb2, adjective2, noun2, adverb2);
        System.out.println(str);
    }
}
