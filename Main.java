//Dev gandhi
//23070126046
//AIML A2

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        deck.createDeck();

        while (true) {
            System.out.println("\n--- Deck Menu ---");
            System.out.println("1. Display Deck");
            System.out.println("2. Display a Specific Card");
            System.out.println("3. Find Cards with the Same Suit");
            System.out.println("4. Find Cards with the Same Rank");
            System.out.println("5. Find a Specific Card");
            System.out.println("6. Deal 5 Random Cards");
            System.out.println("7. Shuffle the Deck");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    deck.displayDeck();
                    break;

                case 2:
                    System.out.print("Enter rank of the card: ");
                    String rank = scanner.next();
                    System.out.print("Enter suit of the card: ");
                    String suit = scanner.next();
                    deck.displayCard(rank, suit);
                    break;

                case 3:
                    System.out.print("Enter rank of the card: ");
                    String sameRank = scanner.next();
                    System.out.print("Enter suit of the card: ");
                    String sameSuit = scanner.next();
                    deck.sameCard(sameRank, sameSuit);
                    break;

                case 4:
                    System.out.print("Enter rank of the card: ");
                    String compareRank = scanner.next();
                    System.out.print("Enter suit of the card: ");
                    String compareSuit = scanner.next();
                    deck.compareCard(compareRank, compareSuit);
                    break;

                case 5:
                    System.out.print("Enter rank of the card: ");
                    String findRank = scanner.next();
                    System.out.print("Enter suit of the card: ");
                    String findSuit = scanner.next();
                    deck.findCard(findRank, findSuit);
                    break;

                case 6:
                    deck.dealCard();
                    break;

                case 7:
                    deck.shuffleDeck();
                    System.out.println("Deck shuffled successfully.");
                    break;

                case 8:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please enter a number between 1-8.");
            }
        }
    }
}
