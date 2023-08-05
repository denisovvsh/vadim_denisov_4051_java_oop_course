package java_oop.Sem3;

public interface QueueBehaviour {
    void enqueue(String person);
    String dequeue();
    int getSize();
    boolean isEmpty();
}