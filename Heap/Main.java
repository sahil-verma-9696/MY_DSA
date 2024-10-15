class MaxHeap {
    private int arr[] = new int[100];
    public int size = 0;

    public MaxHeap() {
        arr[0] = -1;
    }

    public void insert(int data) {
        size = size + 1;
        int index = size;
        arr[index] = data;

        // Heapify up
        while (index > 1) {
            int parent = (index / 2);
            if (arr[parent] < arr[index]) {
                // swap parent and child
                int t = arr[parent];
                arr[parent] = arr[index];
                arr[index] = t;

                index = parent;
            } else {
                return;
            }
        }
    }

    public int delete() {

        if (size == 0) {
            System.out.println("Heap is empty.");
            return -1;
        }

        // Swap root with the last element
        int rootValue = arr[1];
        arr[1] = arr[size];
        arr[size] = 0;
        size--;

        // heapify down
        int parent = 1;

        while (parent * 2 <= size) {

            int left = parent * 2;
            int right = parent * 2 + 1;
            int largest = parent;

            if (left <= size && arr[left] > arr[largest]) {
                largest = left;
            }
            if (right <= size && arr[right] > arr[largest]) {
                largest = right;
            }

            if (largest != parent) {
                // Swap parent with the largest child
                int t = arr[largest];
                arr[largest] = arr[parent];
                arr[parent] = t;

                parent = largest; // Move to the child node
            } else {
                break;
            }
        }

        return rootValue;
    }

    public static void heapify(int arr[], int size, int parent) {
        // means no element in array
        if (size == 0)
            return;

        while (parent * 2 <= size) {
            int left = parent * 2;
            int right = parent * 2 + 1;

            int largest = parent;

            if (left <= size && arr[left] > arr[parent])
                largest = left;
            if (right <= size && arr[right] > arr[parent])
                largest = right;

            if (largest != parent) {
                int t = arr[largest];
                arr[largest] = arr[parent];
                arr[parent] = t;

                parent = largest;
            } else {
                return;
            }
        }
    }

    public void display() {
        for (int i = 1; i <= size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class MinHeap {
    private int arr[] = new int[100];
    public int size = 0;

    public MinHeap() {
        arr[0] = -1;
    }

    public void insert(int data) {
        size = size + 1;
        int index = size;
        arr[index] = data;

        // Heapify up
        while (index > 1) {
            int parent = (index / 2);
            if (arr[parent] > arr[index]) {
                // swap parent and child
                int t = arr[parent];
                arr[parent] = arr[index];
                arr[index] = t;

                index = parent;
            } else {
                return;
            }
        }
    }

    public int delete() {

        if (size == 0) {
            System.out.println("Heap is empty.");
            return -1;
        }

        // Swap root with the last element
        int rootValue = arr[1];
        arr[1] = arr[size];
        arr[size] = 0;
        size--;

        // heapify down
        int parent = 1;

        while (parent * 2 <= size) {

            int left = parent * 2;
            int right = parent * 2 + 1;
            int smallest = parent;

            if (left <= size && arr[left] < arr[smallest]) {
                smallest = left;
            }
            if (right <= size && arr[right] < arr[smallest]) {
                smallest = right;
            }

            if (smallest != parent) {
                // Swap parent with the largest child
                int t = arr[smallest];
                arr[smallest] = arr[parent];
                arr[parent] = t;

                parent = smallest; // Move to the child node
            } else {
                break;
            }
        }

        return rootValue;
    }

    public static void heapify(int arr[], int size, int parent) {
        if (size == 0)
            return;

        while (parent * 2 <= size) {
            int left = parent * 2;
            int right = parent * 2 + 1;
            int smallest = parent;

            if(left<=size && arr[left] < arr[parent]) left = smallest;
            if(right<=size && arr[right] < arr[parent]) right = smallest;

            if(smallest != parent){
                int t = arr[smallest];
                arr[smallest] = arr[parent];
                arr[parent] = t;
            }else{
                return;
            }
        }
    }

    public void display() {
        for (int i = 1; i <= size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Main {

    public static void main(String arg[]) {

        int arr[] = { -1, 40, 43, 35, 55, 60 };
        int n = arr.length - 1;

        for (int i = n / 2; i >= 1; i--) {
            MinHeap.heapify(arr, n, i);
        }

        System.out.println("heapified array");
        for (int i : arr)
            System.out.print(i + " ");
    }
}