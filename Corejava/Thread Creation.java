class MessageThread extends Thread {
    private String message;

    public MessageThread(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(message + " - " + i);
            try {
                Thread.sleep(500); // pause for 500ms
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        MessageThread thread1 = new MessageThread("Thread 1");
        MessageThread thread2 = new MessageThread("Thread 2");

        thread1.start();
        thread2.start();
    }
}
