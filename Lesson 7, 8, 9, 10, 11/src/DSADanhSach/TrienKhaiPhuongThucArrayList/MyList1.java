package DSADanhSach.TrienKhaiPhuongThucArrayList;

public class MyList1<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private E[] elements;

    public MyList1() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyList1(int capacity) {
        elements = (E[]) new Object[capacity];
    }


    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("index " + index + " out of bounds");
    }

    public void add(int index, E element) {
        for (int i = size - 1; i >= index; i--) {
            elements[i+1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        checkIndex(index);

        E element = (E) elements[index];

        for (int i = index; i < size-1; i++) {
            elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size--;
        return element;
    }

    public int size() {
        return size;
    }

    public MyList1<E> clone() {
        MyList1<E> cloneList = new MyList1<>();
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == null) break;
            cloneList.add(i,elements[i]);
        }
        return cloneList;
    }

    public boolean contains(E element) {
        boolean contain = false;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == element) {
                contain = true;
                break;
            }
        }
        return contain;
    }

    public int indexOf(E element) {
        if (contains(element)) {
            int index = 0;
            for (int i = 0; i < elements.length; i++) {
                if (elements[i] == element) {
                    index = i;
                    break;
                }
            }
            return index;
        } else {
            return -1;
        }
    }

    public boolean add(E element) {
        elements[size] = element;
        size++;
        return true;
    }

    public void ensureCapacity() {
        if (size >= elements.length) {
            E[] newElements = (E[]) (new Object[size * 2 + 1]);
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }

    public E get(int index) {
        checkIndex(index);
        E element = null;
        for (int i = 0; i < elements.length; i++) {
            if (i == index) {
                element = elements[i];
                break;
            }
        }
        return element;
    }

    public void clear() {
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            result.append(elements[i]);
            if (i < size - 1) result.append(", ");
        }

        return result.toString() + "]";
    }
}
