import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleArraysTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    //Given
    void count1() {
        double[] a = {1.2, 2.3, 3.4};
        int expected = 3;

        //When
        AverageDoubleArrays obj = new AverageDoubleArrays();

        //Then
        assertEquals(expected, obj.count(a));
    }

    @Test
    //Given
    void count2() {
        double[] a = {2.54};
        int expected = 1;

        //When
        AverageDoubleArrays obj = new AverageDoubleArrays();

        //Then
        assertEquals(expected, obj.count(a));
    }

    @Test
    void count3() {
        //Given
        double[] a = {1.222, 2.333};
        int expected = 2;

        //When
        AverageDoubleArrays obj = new AverageDoubleArrays();

        //Then
        assertEquals(expected, obj.count(a));
    }

    @Test
    //Given
    void sum1() {
        double[] a = {1.2, 2.3, 3.4};
        double expected = 6.9; //:D

        //When
        AverageDoubleArrays obj = new AverageDoubleArrays();

        //Then
        assertEquals(expected, obj.sum(a));
    }

    @Test
    void sum2() {
        //Given
        double[] a = {0, 2.45};
        double expected = 2.45;

        //When
        AverageDoubleArrays obj = new AverageDoubleArrays();

        //Then
        assertEquals(expected, obj.sum(a));
    }

    @Test
    void sum3() {
        //Given
        double[] a = {4.333, 3.44, 1.222, 2.11};
        double expected = 11.104999999999999;

        //When
        AverageDoubleArrays obj = new AverageDoubleArrays();

        //Then
        assertEquals(expected, obj.sum(a));
    }

    @Test
    //Given
    void average1() {
        //Given
        double[] a = {1.2, 2.3, 3.4};
        double expected = 2.3000000000000003;

        //When
        AverageDoubleArrays obj = new AverageDoubleArrays();

        //Then
        assertEquals(expected, obj.average(a));
    }

    @Test
    void average2() {
        //Given
        double[] a = {Math.PI, Math.PI, Math.PI};
        double expected = Math.PI;

        //When
        AverageDoubleArrays obj = new AverageDoubleArrays();

        //Then
        assertEquals(expected, obj.average(a));
    }
}