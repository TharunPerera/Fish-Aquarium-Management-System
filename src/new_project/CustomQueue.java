
package new_project;

public class CustomQueue<T> {

      private Object[] elements;
      private int size;
      private int capacity;
      private int front;
      private int rear;

      public CustomQueue(int capacity) {
            this.capacity = capacity;
            elements = new Object[capacity];
            size = 0;
            front = 0;
            rear = -1;
      }

      public void enqueue(T item) {
            if (isFull()) {
                  throw new IllegalStateException("Queue is full");
            }
            rear = (rear + 1) % capacity;
            elements[rear] = item;
            size++;
      }

      public T dequeue() {
            if (isEmpty()) {
                  throw new IllegalStateException("Queue is empty");
            }
            T item = (T) elements[front];
            front = (front + 1) % capacity;
            size--;
            return item;
      }

      public boolean isEmpty() {
            return size == 0;
      }

      public boolean isFull() {
            return size == capacity;
      }
}
