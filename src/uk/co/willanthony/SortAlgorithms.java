package uk.co.willanthony;

public class SortAlgorithms {

    /*
    *Bubble Sort
    *
    *0(n2) (quadratic) time complexity, one of the slower sort methods.
    *Bubble sort checks if element j is greater than element j + 1. If it is, both elements are swapped/
    *This causes the largest numbers to 'bubble to the top leaving a sorted and unsorted partition.
    *This implementation sorts largest numbers to the left
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


    /*
    *Selection Sort
    *
    * 0(n2) time complexity, usually faster than bubble sort though
    * Selection sort use a sorted and unsorted partition, similar to bubble sort.
    * Selection sort keeps track of the current largest numbers index, iterating through all
    * other elements.
    * The final element is swapped with the largest element.
    * This implementation sorts largest numbers to the left
    *
    * */

    public int[] selectionSort(int[] array) {
        for(int i = array.length; i > 0; i--) {
            int largest = 0;
            for (int j = 0; j < i; j++) {
                if(array[j] > array[largest]) {
                    largest = j;
                }
            }
            int temp = array[i - 1];
            array[i - 1] = array[largest];
            array[largest] = temp;
        }
        return array;
    }
}
