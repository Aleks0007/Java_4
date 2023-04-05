import java.util.LinkedList;
import java.util.Random;

class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> originalList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            originalList.add(random.nextInt(11));
        }
        System.out.println("Заданный LinkedList: " + originalList);
        originalList = reverse(originalList);
        System.out.println("Перевёрнутый LinkedList: " + originalList);
    }

    public static <T> LinkedList<T> reverse(LinkedList<T> originalList) {
        LinkedList<T> reversedList = new LinkedList<>();
        originalList.forEach(item -> reversedList.addFirst(item));
        return reversedList;
    }
}