import java.util.LinkedList;

class Queue<T> {
    public LinkedList<T> list = new LinkedList<T>();

    // Добавляет элемент в конец очереди
    public void enqueue(T value) {
        list.addLast(value);
    }

    // Возвращает и удаляет первый элемент из очереди
    public T dequeue() {
        return list.removeFirst();
    }

    // Возвращает первый элемент из очереди, не удаляя его
    public T first() {
        return list.getFirst();
    }
    // Возвращает количество элементов в очереди
    public int size() {
        return list.size();
    }

    // Печатает элементы очереди (LinkedList)
    public void printQueue() {
        System.out.println(list);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.print("Очередь до добавления: ");
        queue.printQueue();

        queue.enqueue(5);

        System.out.print("Очередь после добавления: ");
        queue.printQueue();

        System.out.println("Первый элемент: " + queue.first());
        System.out.println("Удаленный элемент: " + queue.dequeue());

        System.out.print("Текущая очередь: ");
        queue.printQueue();

        System.out.println("Первый элемент: " + queue.first());
    }
}