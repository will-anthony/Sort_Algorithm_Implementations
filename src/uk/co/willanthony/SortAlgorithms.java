package uk.co.willanthony;

public class SortAlgorithms {

    /**
     * Bubble Sort
     *
     * 0(n2) (quadratic) time complexity, one of the slower sort methods.
     * Bubble sort checks if element j is greater than element j + 1. If it is, both elements are swapped/
     * This causes the largest numbers to 'bubble to the top leaving a sorted and unsorted partition.
     * This implementation sorts largest numbers to the left
     *
     * */
    public int[] bubbleSort(int[] array) {

        for (int i = array.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }



    /**
     * Selection Sort
     *
     * 0(n2) time complexity, usually faster than bubble sort though
     * Selection sort uses a sorted and unsorted partition, similar to bubble sort.
     * Selection sort keeps track of the current largest numbers index, iterating through all
     * other elements.
     * The final element is swapped with the largest element.
     * This implementation sorts largest numbers to the left
     *
     * */
    public int[] selectionSort(int[] array) {
        for (int i = array.length; i > 0; i--) {
            int largest = 0;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[largest]) {
                    largest = j;
                }
            }
            int temp = array[i - 1];
            array[i - 1] = array[largest];
            array[largest] = temp;
        }
        return array;
    }



    /**
     * Insertion sort
     * 0(n2) time complexity
     * Insertion sort also sorts array using a sorted and unsorted partition.
     * First element of the array is counted as 'sorted'. The next element is compared. If it's larger it remains in place.
     * If not the left hand element is shifted right to make way for it.
     *
     */
    public int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int newElement = array[i];
            int j;

            for (j = i; j > 0 && array[j - 1] > newElement; j--) {
                array[j] = array[j - 1];
            }
            array[j] = newElement;
        }
        return array;
    }



    /**
     * Shell sort
     * 0(n2) time complexity although usually much faster than insertion sort.
     * Similar to insertion sort but uses larger gaps when checking 2 elements. The gap closes as the algorithm progresses
     * until you are left performing a normal insertion sort.
     * If not the left hand element is shifted right to make way for it.
     *
     */
    public int[] shellSort(int[] array) {

        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            // at this point the algorithm becomes insertion sort
            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];

                int j = i;

                while (j >= gap && array[j - gap] > newElement) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = newElement;
            }
        }
        return array;
    }


    /**
     * Merge sort
     *
     * 0(nlogn) time complexity.
     * The array is split in half, then each half is split in half until there each element is its own array.
     * Then each piece is then merge with another and sorted, then those pieces are merge and sorted.
     * The merge phase requires a temp array, therefore it is not ion an in-place algorithm.
     * It is a stable algorithm.
     * It use recursion
     */
    public int[] mergeSort(int[] array) {
        int start = 0;
        int end = array.length;

        separateElements(array, start, end);

        return array;
    }

    private void separateElements(int[] array, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        separateElements(array, start, mid);
        separateElements(array, mid, end);
        merge(array, start, mid, end);
    }

    private static void merge(int[] input, int start, int mid, int end) {

        // if true both sides of the array must already be sorted
        if(input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while(i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i , input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0 , input, start, tempIndex);
    }
}
