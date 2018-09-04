package concurrency.messages;

import java.util.Random;

/**
 * Think of this class where perform reading and writing messages of some sort and see how multi-threading plays into it
 * Classic producer, consumer problem
 */
public class App {
    public static void main(String[] args) {
        Message message = new Message();
        new Thread(new Writer(message)).start();
        new Thread(new Reader(message)).start();
    }
}

class Message {
    private String message;
    private boolean empty = true;

    public synchronized String read() {
        while (empty) {

        }
        empty = true;
        return message;
    }

    public synchronized void write(String message) {
        while (!empty) {

        }
        empty = false;
        this.message = message;
    }
}

/**
 * Producer class
 */
class Writer implements Runnable {
    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String[] messages = {
                "Humpty Dumpty sat on a wall",
                "Humpty Dumpty had a great fall",
                "All the king's horses and all the king's men",
                "Couldn't put Humpty together again"
        };

        Random random = new Random();
        for (int i = 0; i < messages.length; i++) {
            message.write(messages[i]);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {

            }
        }
        message.write("Finished");
    }
}

/**
 * Consumer class
 */
class Reader implements Runnable {
    private Message message;

    Reader(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (String latestMessage = message.read(); !latestMessage.equals("Finished"); latestMessage = message.read()) {
            System.out.println("latestMessage = " + latestMessage);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException ex) {

            }
        }
    }
}