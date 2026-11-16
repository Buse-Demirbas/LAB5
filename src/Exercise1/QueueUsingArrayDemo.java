package Exercise1;

/**
 * Your Name:        Buse Demirbaş
 * Your Student ID:  240444050
 * Your Date:        16.11.2026
 */
public class QueueUsingArrayDemo {

    public static void main(String[] args) {

        String[] students = {
                "Ali", "Ayse", "Mehmet", "Zeynep", "Ahmet",
                "Elif", "Mustafa", "Fatma", "Can", "Ece",
                "Burak", "Deniz", "Emre", "Selin", "Mert",
                "Ceren", "Kerem", "Dilan", "Onur", "Seda"
        };

        // Create Queue object with capacity 10
        Queue<String> queue = new Queue<>(10);

        // Insert the first 10 student names into the queue
        for (int i = 0; i < 10; i++) {
            queue.enqueue(students[i]);
        }

        // Display the original queue
        System.out.println("Original Queue: " + queue.toString());

        // Display the queue size
        System.out.println("Queue Size: " + queue.size());

        // Display the first student using peek()
        System.out.println("First Student: " + queue.peek());

        // Remove three students using dequeue()
        System.out.println("\nRemoving three students:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Removed: " + queue.dequeue());
        }

        // Display the remaining queue
        System.out.println("\nQueue After Removal: " + queue.toString());

        // Display the final queue size
        System.out.println("Final Queue Size: " + queue.size());

        /*
         * ANSWER TO THE QUESTION IN COMMENTS:
         * Why does queue.enqueue(students[11]) give an error (ArrayIndexOutOfBoundsException)?
         * Answer: Because this is a linear (non-circular) array queue. Even though we removed 3 elements
         * from the front (indices 0, 1, 2 are now null), 'rear' is still at index 9 (the end of the array).
         * When we do rear++, it becomes 10, which is out of bounds for an array of size 10.
         *
         * What can you use to add the 11th student to the array?
         * Answer: We must implement a Circular Queue using modulo arithmetic: rear = (rear + 1) % items.length;
         */
    }
}
