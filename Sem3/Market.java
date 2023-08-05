package java_oop.Sem3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour, Iterable<String> {
    private Queue<String> queue;

    public Market() {
        queue = new LinkedList<>();
    }

    // Методы из QueueBehaviour
    @Override
    public void enqueue(String person) {
        queue.offer(person);
    }

    @Override
    public String dequeue() {
        return queue.poll();
    }

    @Override
    public int getSize() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Методы из MarketBehaviour
    @Override
    public void addPersonToQueue(String person) {
        enqueue(person);
    }

    @Override
    public String serveNextPerson() {
        if (!isEmpty()) {
            return dequeue();
        } else {
            return "No one to serve.";
        }
    }

    @Override
    public void update() {
        // В данном примере, метод update просто выводит состояние магазина на экран
        System.out.println("Queue size: " + getSize());
        if (!isEmpty()) {
            System.out.println("Next person in queue: " + queue.peek());
        } else {
            System.out.println("No one in the queue.");
        }
    }

    // Метод для обработки заказа с помощью OrderProcessor
    public void processOrder(OrderProcessor orderProcessor, String order) {
        orderProcessor.processOrder(order);
    }

    @Override
    public Iterator<String> iterator() {
        return new QueueIterator();
    }

    // Внутренний класс, представляющий итератор для очереди
    private class QueueIterator implements Iterator<String> {
        private Iterator<String> queueIterator = queue.iterator();

        @Override
        public boolean hasNext() {
            return queueIterator.hasNext();
        }

        @Override
        public String next() {
            return queueIterator.next();
        }
    }

    // Дополнительный метод для проверки состояния очереди
    public void printQueue() {
        System.out.println("Queue: " + queue);
    }
}

