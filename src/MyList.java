public class MyList <T> {
    int i = 0;
    static int capacity;
    int[] array;


    public MyList() {
        capacity = 10;
        array = new int[10];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
    }

    int size() {
        return i;
    }

    void getCapacity() {
        System.out.println(capacity);
    }

    void add(T data) {
        String sayi = data.toString();
        array[i] =  Integer.parseInt(sayi);
        i++;
        if(i == (capacity - 1)) {
            capacity *= 2;
            array = new int[capacity];
        }
    }

    void get(int index) {
        if (index <= i && index >= 0) {
            System.out.println(array[index]);
        }else {
            System.out.println("null");
        }
    }

    void remove(int index) {
        if(index <= i && index >= 0) {
            array[index] = 0;
            for(int a=index;a<i;a++) {
                array[a] = array[a + 1];
            }
            i--;
        }else {
            System.out.println("null");
        }
    }

    void set(int index, T data) {
        if(index < i && index >= 0) {
            array[index] = (int) data;
        }else {
            System.out.println("null");
        }
    }

    public String toString() {
        System.out.print("[");
        for (int a = 0; a<i; a++) {
            System.out.print(array[a]);
            if(array[a + 1] != 0) {
                System.out.print(",");
            }
        }
        return "]";
    }

    int indexOf(T data) {
        int a = 0;
        while (array[a] != (int) data) {
            a++;
            if(a>i) {
                break;
            }
        }
        if(array[a] == (int) data) {
            return a;
        }else {
            return -1;
        }
    }

    int lastIndexOf(T data) {
        int a = i;
        while (array[a] != (int) data) {
            a--;
            if(a < 0) {
                break;
            }
        }
        if(array[a] == (int) data) {
            return a;
        }else {
            return -1;
        }
    }

    boolean isEmpty() {
        if(size()==0) {
            return true;
        }else {
            return false;
        }
    }


    void clear() {
        for(int a = i; a>=0; a--) {
            array[a] = 0;
            i--;
        }
    }

    MyList<T>subList(int start, int finish) {
        int a = (int) start;
        int b=0;
        i = 0;
        while(a<=finish) {
            array[b] = array[a];
            b++;
            a++;
            i++;
        }
        return null;
    }

    boolean contains(T data) {
        for(int a = 0; a <= i; i++) {
            if(array[a] == (int) data) {
                return true;
            }
        }
        return false;
    }


    
}
