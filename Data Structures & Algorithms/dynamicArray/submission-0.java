class DynamicArray {
    private int capacity;
    private int size;
    private int[] arr;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if(size == capacity)
            resize();
        arr[size] = n;
        size++;
    }

    public int popback() {
        int i = arr[size - 1];
        size--;
        return i;
    }

    private void resize() {
        int[] newArr = new int[capacity * 2];
        for(int i = 0; i < capacity; i++)
        {
            newArr[i] = arr[i];
        }
        arr = newArr;
        capacity *= 2;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
