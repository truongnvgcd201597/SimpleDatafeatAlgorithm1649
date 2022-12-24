package src;

import java.util.Scanner;

public class Main {
    private static final int MAX_INPUT_LENGTH = 250;
    private static final String INVALID_INPUT_ERROR = "Error: input must be a string of at most 250 characters.";
    private static final String EMPTY_INPUT_ERROR = "Error: input cannot be empty.";

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inputMethod();
    }

    private static void inputMethod() {
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        validateInput(input);
    }

    private static void validateInput(String input) {
        if (input.length() > MAX_INPUT_LENGTH) {
            throw new IllegalArgumentException(INVALID_INPUT_ERROR);
        }
        if (input.isEmpty()) {
            throw new IllegalArgumentException(EMPTY_INPUT_ERROR);
        }else{
            splitAndEnqueue(input);
        }
    }

    private static void splitAndEnqueue(String input) {
        String[] words = input.split("\\.");
        Queue queue = new Queue();
        for (String word : words) {
            queue.add(word);
        }
        pushOntoStack(queue);
    }

    private static void pushOntoStack(Queue queue) {
        Stack stack = new Stack();
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        printFromStack(stack);
    }

    private static void printFromStack(src.Stack stack) {
        while (!stack.isEmpty()) {
            stack.print();
        }
    }
}
