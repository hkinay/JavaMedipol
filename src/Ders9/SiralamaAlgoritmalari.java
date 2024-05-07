package Ders9;

public class SiralamaAlgoritmalari {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void insertionSort(int arr[]) {
        for(int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = value;
        }
    }

    public static void shellSort(int[] a) {
        for (int increment = a.length / 2; increment > 0; increment = (increment == 2 ? 1 : (int) Math.round(increment / 2.2))) {
            for (int i = increment; i < a.length; i++) {
                int temp = a[i];
                for (int j = i; j >= increment && a[j - increment] > temp; j -= increment){
                    a[j] = a[j - increment];
                    a[j - increment] = temp;
                }
            }
        }
    }
    public static int[] mergeSort(int arr[]) {
        if( arr.length <= 1 ) {
            return arr;
        } else {
            int middle = (int)(arr.length/2);
            int left[] = new int[middle];
            int right[] = new int[arr.length-middle];
            for( int i=0; i<middle; i++) {
                left[i] = arr[i];
            }
            for( int i=middle; i<arr.length; i++ ) {
                right[i-middle] = arr[i];
            }
            left = mergeSort(left);
            right = mergeSort(right);
            int result[] = merge(left, right);
            return result;
        }
    }

    public static int[] merge(int left[], int right[]) {
        int result[] = new int[left.length + right.length];
        int i=0, posLeft = 0, posRight = 0;
        while(left.length > posLeft && right.length > posRight ) {
            if( left[posLeft] <= right[posRight] ) {
                result[i] = left[posLeft];
                posLeft++;
            } else {
                result[i] = right[posRight];
                posRight++;
            }
            i++;
        }
        if( left.length > posLeft ) {
            for(; posLeft<left.length; posLeft++) {
                result[i] = left[posLeft];
                i++;
            }
        }
        if( right.length > posRight ) {
            for(; posRight<right.length; posRight++) {
                result[i] = right[posRight];
                i++;
            }
        }
        return result;
    }

    public static void quickSort(int arr[], int left, int right) {
        if( left < right ) {
            int pivotIndex = (int) (left + (right-left)/2);
            int pivotNewIndex = partition(arr, left, right, pivotIndex);
            quickSort(arr, left, pivotNewIndex - 1);
            quickSort(arr, pivotNewIndex + 1, right);
        }
    }

    public static int partition(int arr[], int left, int right, int pivotIndex) {
        int pivotValue = arr[pivotIndex];
        arr[pivotIndex] = arr[right];
        arr[right] = pivotValue;
        int storeIndex = left;
        for(int i=left; i<right; i++) {
            if( arr[i] < pivotValue ) {
                int temp = arr[i];
                arr[i] = arr[storeIndex];
                arr[storeIndex] = temp;
                storeIndex++;
            }
        }
        int temp = arr[right];
        arr[right] = arr[storeIndex];
        arr[storeIndex] = temp;
        return storeIndex;
    }
    public static void bubbleSort(int arr[]) {
        boolean swapped = false;
        do {
            swapped = false;
            for(int i=1; i<arr.length; i++) {
                if( arr[i-1] > arr[i] ) {
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    swapped = true;
                }
            }
        } while(swapped);
    }





}
