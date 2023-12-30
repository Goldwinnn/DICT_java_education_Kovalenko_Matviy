package ChatBot;
import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1st stage
        System.out.println("Hello! My name is MyBot.");
        System.out.println("I was created in 2023.");
        // 2nd stage
        System.out.println("Please, remind me your name.");
        String userName = scanner.nextLine();
        System.out.println("What a great name you have, " + userName + "!");