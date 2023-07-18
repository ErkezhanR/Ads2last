public interface MyLinkedList {
    class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;
    }

    public class LinkedList<E> {
        int size;
        Node<E> first;
        Node<E> last;
    }
    public void add (int index, E element){
        head = new ListNode(null);
        tail = new ListNode(null);
        listCount = 0;
    }
    T get(int index){
        int num=-1;
        if(index<0 || index>numItems){
            throw new ArrayIndexOutOfBoundsException("Index is out of bounds: "    + index);
        }
        else
            return sortedArray[index];
        remove(int index)

    }
    int size() {
        return size;
    }
}

