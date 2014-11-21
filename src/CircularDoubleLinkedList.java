/**
 * Created by dmanzelmann on 11/21/14.
 */


public class CircularDoubleLinkedList<E> implements clone {
    private Node head;
    private Node rear;
    int numberOfNodes = 0;

    public CircularDoubleLinkedList() {
        head = new Node();
        head.data = null;
        head.next = rear;
        head.prev = rear;
        rear.next = head;
        rear.prev = head;
    }

    public boolean insert(E o) {

        return false;
    }

    public E fetch(String targetKey) {

    }

    public boolean delete(String targetKey) {

    }

    public boolean update(String targetKey, E o) {

    }

    private static <E> E deepCopy(E o) {
        //E clone = o.clone();
    }


    private class Node<E> {
        private E data;
        private Node next;
        private Node prev;
        public Node() {}
    }

}
