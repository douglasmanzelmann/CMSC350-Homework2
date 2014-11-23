/**
 * Created by dmanzelmann on 11/21/14.
 */

/*
public class CircularDoubleLinkedListSecond<Item> {
    private Node head;
    private Node rear;
    int numberOfNodes = 0;

    public CircularDoubleLinkedListSecond() {
        head = new Node();
        rear = new Node();
        head.data = null;
        head.next = rear;
        head.prev = rear;
        rear.next = head;
        rear.prev = head;
    }

    public boolean insert(E o) {
        Node newNode = new Node();
        Data newData = (Data) o;
        newNode.data = newData.deepCopy();

        if (newNode == null)
            return false;
        else {
            if (numberOfNodes == 0) {
                head = newNode;
                numberOfNodes++;
            }
            else if (numberOfNodes == 1) {
                rear.data = head.data;
                head.data = newNode.data;
            }

            else {
                newNode.next = head;
                newNode.prev = rear;
                head = newNode;
            }
        }
        return true;
    }

    public E fetch(E targetKey) {
        Data target = null;
        target.data = (Comparable) targetKey;

        Node current = new Node();
        current = head;

        if (head.data.compareTo((Data) target.data) == 0) {
            return (E) head.data.deepCopy();
        }

        current = head.next;

        while (current != head && !(current.data.compareTo((Data)target.data) == 0)) {
            current = current.next;
        }

        if (current != head)
            return (E) current.data.deepCopy();
        else
            return null;
    }

    public boolean delete(String targetKey) {
        return false;
    }

    public boolean update(String targetKey, E o) {
        return false;
    }


    private class Data<E extends Comparable<? super E>> implements Comparable<Data<E>> {
        private Object data;

        @Override
        public int compareTo(Data<E> other) {
            return data.compareTo(other.data);
        }

        public Data deepCopy() {
            Data newData = new Data();
            newData.data = data;
            return (Data) newData.data;
        }
    }

    private class Node {
        private Data data;
        private Node next;
        private Node prev;
        public Node() {}
    }

    public static void main(String[] args) {
        CircularDoubleLinkedListSecond<Integer> list = new CircularDoubleLinkedListSecond<Integer>();

        list.insert(5);
        list.insert(3);
        list.insert(4);

        System.out.println(list.fetch(3));
    }
}
*/