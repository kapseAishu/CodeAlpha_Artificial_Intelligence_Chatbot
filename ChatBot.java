
package CodeAlpha_ChatBot;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChatBot {
	private static final Map<String, String> responses = new HashMap<>();

    static {
        responses.put("hi", "Hello! How can I help you?");
        responses.put("hello", "Hi there! What can I do for you?");
        responses.put("how are you", "I'm just a bot, but I'm doing fine!");
        responses.put("what is your name", "I'm CodeAlphaBot, your Java assistant.");
        responses.put("help", "I can help with FAQs, try asking about the internship, tasks, or contact info.");
        responses.put("internship", "The internship includes Java, Spring, Hibernate, and real-world projects.");
        responses.put("tasks", "There are 4 tasks: Student Grade Tracker, Stock Trading, Chatbot, Hotel Booking.");
        responses.put("contact", "You can reach CodeAlpha at services@codealpha.tech.");
        responses.put("bye", "Goodbye! All the best with your internship.");
    }

    public static void startChat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("🤖 CodeAlpha ChatBot — Java Console Version");
        System.out.println("Type 'bye' to exit.");
        while (true) {
            System.out.print("\nYou: ");
            String input = scanner.nextLine().toLowerCase().trim();

            if (input.equals("bye")) {
                System.out.println("Bot: " + responses.get("bye"));
                break;
            }

            boolean found = false;
            for (String key : responses.keySet()) {
                if (input.contains(key)) {
                    System.out.println("Bot: " + responses.get(key));
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Bot: Sorry, I didn't understand that. Try asking something else.");
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        startChat();
    }

}
