/* 
Исходная задача:
Реализовать класс Market и все его обязательные методы. 
Этот класс должен реализовывать методы из интерфейса QueueBehaviour, которые имитируют работу очереди. 
Кроме того, класс должен содержать методы, соответствующие интерфейсу MarketBehaviour, 
которые добавляют и удаляют людей из очереди, а также метод update, который обновляет состояние магазина путем принятия и отдачи заказов.

1)В предыдущем ДЗ добавить реализацию собственного функционального интерфейса.
- OrderProcessor

2)Реализовать любой выбранный интерфейс из списка (Iterator<E>, Iterable<E>, Comparator<E>, Comparable<E>) в предыдущем ДЗ, предоставив собственную реализацию.
- Iterable<String>

*/
package java_oop.Sem3;

public class Task1 {
    public static void main(String[] args) {
        Market market = new Market();

        market.addPersonToQueue("Alice");
        market.addPersonToQueue("Bob");
        market.addPersonToQueue("Charlie");

        market.update(); // Выводит состояние магазина и очереди
        market.serveNextPerson(); // Обслуживает следующего человека из очереди

        // Обработка заказа с помощью лямбда-выражения
        market.processOrder(order -> System.out.println("Processing order: " + order), "Buy milk");

        // Использование цикла for-each для итерирования по элементам очереди
        for (String person : market) {
            System.out.println("Person in the queue: " + person);
        }

        market.update(); // Выводит обновленное состояние магазина и очереди
    }    
}
