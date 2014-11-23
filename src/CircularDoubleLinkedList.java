import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by douga_000 on 11/22/2014.
 */
public class CircularDoubleLinkedList<T> {
    private Node<T> head;
    private Node<T> rear;
    private int numberOfNodes = 0;

    public CircularDoubleLinkedList() {
        head = null;
        rear = null;
    }

    private class Node<T> {
        private T data;
        private Node<T> next;
        private Node<T> prev;

        public Node() {
            data = null;
            next = null;
            prev = null;
        }

        public T deepCopy() {
            Node copy = new Node();
            copy.data = data;
            copy.next = next;
            copy.prev = prev;
            return (T)copy.data;
        }
    }

    public boolean insert(T newData) {
        Node temp = new Node();
        temp.data = newData;
        Node newNode = new Node();
        newNode.data = temp.deepCopy();

        if (newNode == null)
            return false;
        else {
            if (numberOfNodes == 0) {
                head = newNode;
                head.next = rear;
                head.prev = rear;
                numberOfNodes++;
            }

            else if (numberOfNodes == 1) {
                rear = head;
                head = newNode;
                head.next = rear;
                head.prev = rear;
                rear.next = head;
                rear.prev = head;
                numberOfNodes++;
            }
            else {
                newNode.next = head;
                newNode.prev = rear;
                head.prev = newNode;
                rear.next = newNode;
                head = newNode;
                numberOfNodes++;
            }
            return true;
        }
    }

    public T fetch(T targetKey) {
        Node<T> current = head;

        for (int i = 0; i < numberOfNodes; i++) {
            System.out.println("key: " + current.data + " target: " + targetKey);
            if (current.data.equals(targetKey)) {
                Node copy = new Node();
                T dataCopy = (T)copy.deepCopy();
                return dataCopy;
            }
            current = current.next;
        }

        return null;
    }

    public boolean delete(T targetKey) {
        Node<T> current = head;

        for (int i = 0; i < numberOfNodes; i++) {
            if (current.data.equals(targetKey)) {
                Node<T> prev = current.prev;
                Node<T> next = current.next;
                prev.next = next;
                next.prev = prev;
                numberOfNodes--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void showAll() {
        Node<T> current = head;

        for (int i = 0; i < numberOfNodes; i++) {
            System.out.print(current.data + ", ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularDoubleLinkedList<String> stringList = new CircularDoubleLinkedList<String>();

        stringList.insert("hello");
        stringList.showAll();
        stringList.insert("my");
        stringList.showAll();
        stringList.insert("name");
        stringList.insert("is");
        stringList.showAll();
        System.out.println(stringList.fetch("is"));
        stringList.delete("hello");
        stringList.showAll();
    }
}
