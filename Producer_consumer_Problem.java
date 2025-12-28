class Buffer {
    private int item;
    private boolean available = false;

    // Producer method
    synchronized void produce(int value) {
        while (available) {
            try {
                wait();   // wait if item already exists
            } catch (Exception e) {}
        }
        item = value;
        available = true;
        System.out.println("Produced: " + item);
        notify(); // notify consumer
    }

    // Consumer method
    synchronized void consume() {
        while (!available) {
            try {
                wait();   // wait if no item
            } catch (Exception e) {}
        }
        System.out.println("Consumed: " + item);
        available = false;
        notify(); // notify producer
    }
}
class Producer extends Thread {
    Buffer buffer;

    Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}
class Consumer extends Thread {
    Buffer buffer;

    Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();
            try {
                Thread.sleep(1500);
            } catch (Exception e) {}
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);

        p.start();
        c.start();
    }
}
