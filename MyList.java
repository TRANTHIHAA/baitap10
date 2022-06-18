package BAITAP1;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY =10;
    private E[] elements;

    public MyList() {
        elements =  (E[])new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = (E[]) new Object[capacity];
    }

    public MyList(int size, E[] elements) {
        elements = (E[]) new Object[size];
    }

    public E[] remove(int index ){
        E e = elements[index];
        for (int i = index; i< size; i++){
            elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size--;
        return elements;
    }

    public int size(){
        return size;
    }

    public E clone(){
        MyList<E> clone = new MyList<>(elements.length);
        for (E e : elements) {
            clone.add(e);
        }
        return (E) clone;
    }

    public boolean contains(E o){
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])){
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o){
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])){
                return i;
            }
        }
        return -1;
    }
    public void add( E e) {
        if (size == elements.length) {
            ensureCapacity(size);
        }
        elements[size++] = e;
    }
    public boolean add(int index,E o){
        if (index >= 0 && index <= size) {
            size += 1;
            ensureCapacity(size);
            for (int i = size - 2; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = o;
            return true;
        }
        return false;


    }

    public void ensureCapacity(int minCapacity){
        if (size >= elements.length){
            E[] newElements =  (E[]) new Object[minCapacity*2+1];
            System.arraycopy(elements,0,newElements,0,size);
            elements = newElements;
        }
    }

    public E get(int i){
        if (i >= 0 && i < size) {
            return  elements[i];
        }else {
            return null;
        }
    }

    public void clear(){
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size =0;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println("element " + i + ": " + elements[i]);
        }
    }

}
