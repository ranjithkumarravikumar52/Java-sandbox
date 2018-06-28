package innerclasses.main;

import java.util.Scanner;

public class App {

    private static Scanner scanner = new Scanner(System.in);
    private static Button button = new Button("Print");

    public static void main(String[] args) {

        class ClickListener implements Button.OnClickListener {

            public ClickListener() {
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked!");
            }
        }

        button.setOnClickListener(new ClickListener());
        listen();

    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    button.onClick();
            }
        }
    }
}
