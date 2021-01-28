package uk.co.willanthony;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortAlgorithmsTest {

    SortAlgorithms sortAlgorithms;

    @BeforeEach
    void setUp() {
        sortAlgorithms = new SortAlgorithms();
    }

    @org.junit.jupiter.api.Test
    void bubbleSortWithUniqueElements() {
        assertArrayEquals(new int[]{-19,-15,0,4,7,9}, sortAlgorithms.bubbleSort(new int[]{-15,4,-19,9,7,0}));
    }

    @org.junit.jupiter.api.Test
    void bubbleSortWithPairsOfElements() {
        assertArrayEquals(new int[]{-19,-15,-15,0,4,7,9}, sortAlgorithms.bubbleSort(new int[]{-15,4,-19,9,-15,7,0}));
    }

    @Test
    void selectionSort() {
        assertArrayEquals(new int[]{-19,-15,0,4,7,9}, sortAlgorithms.selectionSort(new int[]{-15,4,-19,9,7,0}));
    }

    @Test
    void insertionSort() {
        assertArrayEquals(new int[]{-19,-15,0,4,7,9}, sortAlgorithms.insertionSort(new int[]{-15,4,-19,9,7,0}));
    }

    @Test
    void shellSort() {
        assertArrayEquals(new int[]{-19,-15,0,4,7,9}, sortAlgorithms.shellSort(new int[]{-15,4,-19,9,7,0}));

    }

    @Test
    void mergeSort() {
        assertArrayEquals(new int[]{-19,-15,0,4,7,9}, sortAlgorithms.mergeSort(new int[]{-15,4,-19,9,7,0}));

    }
}