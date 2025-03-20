class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

       // STUDENT TODO
        boolean swap = false;

        do {
            swap = false;

            for(int i = 1; i < n; i++) {
                if(arr[i-1] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    swap = true;
                }
            }
            n--;
        } while(swap);
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}   