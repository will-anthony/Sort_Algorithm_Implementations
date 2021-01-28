package uk.co.willanthony;

public class SortAlgorithms {

    /*
    0(n2) (quadratic) time complexity, one of the slower sort methods
    Bubble sort checks if element j is greater than element j + 1. If it is, both elements are swapped/
    This causes the largest numbers to 'bubble to the top leaving a sorted and unsorted partition.
    This implementation sorts largest numbers to the left
     */

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
}
