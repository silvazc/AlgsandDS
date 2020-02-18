import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<E> implements List<E> {
    /***** Fields *****/
    private MyListNode head;
    private int size;

    /***** Constructors *****/
    public MyLinkedList() {
        head = new MyListNode();
        size = 0;
    }



    /***** Methods *****/

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        return addToEnd(e);
    }

    // Appends the specified element to the
    // end of the list
    private boolean addToEnd(E e) {
        // Empty list, only need to change
        // the value of the head node
        if (size == 0) {
            head.data = e;
            size++;
            return true;
        }

        MyListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new MyListNode(null, current, e);

        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }


    private class MyListNode {
        public MyListNode next;
        public MyListNode prev;
        public E data;

        public MyListNode(){
            this(null, null, null);
        }

        public MyListNode(E data) {
            this(null, null, data);
        }

        public MyListNode(MyListNode next, MyListNode prev, E data) {
            this.next = next;
            this.prev = prev;
            this.data = data;
        }
    }
}
