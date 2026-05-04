# Example 01
``` java
import java.util.LinkedList;
import java.util.Queue;
public class IT24037 {
    public static void main(String[] args) {
        Queue<String> customerQueue = new LinkedList<>();
        customerQueue.offer("Customer 1");
        customerQueue.offer("Customer 2");
        customerQueue.offer("Customer 3");
        System.out.println("Current Queue: " + customerQueue);
        String servedCustomer = customerQueue.poll();
        System.out.println("Serving: " + servedCustomer);
        System.out.println("Queue after serving one: " + customerQueue);
        servedCustomer = customerQueue.poll();
        System.out.println("Serving: " + servedCustomer);

        System.out.println("Final Queue: " + customerQueue);
    }
}

```

# Example 02
``` java
import java.util.LinkedList;
import java.util.Queue;
public class IT24037 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");
        System.out.println("Queue: " + queue);
        String removedItem = queue.poll();
        System.out.println("Removed Item: " + removedItem);
        System.out.println("Queue after dequeue: " + queue);
    }
}

```
