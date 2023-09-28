import java.util.Scanner;
public class ChatBotRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChatBot chatgpt = new ChatBot("ChatGPT", 12);

        chatgpt.greeting("Farhan");
        chatgpt.favoriteNumber(73);
        System.out.println("I can add numbers too! Watch this");
        System.out.println("1 + 2 + 3 = " + chatgpt.addNumbers(1,2,3));
        chatgpt.weather();
        System.out.println("Ask me to convert feet to meters.");
        System.out.println("Enter a number in feet");
        int feet = scanner.nextInt();
        System.out.println(feet + " feet is " + chatgpt.convertFeetToMeters(feet) + " meters");
        chatgpt.fact();
        System.out.println(chatgpt.otherFact());
        System.out.print(chatgpt.goodbye());

    }
}
