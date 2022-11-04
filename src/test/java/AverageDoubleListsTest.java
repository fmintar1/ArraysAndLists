import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleListsTest {

    ArrayList<Double>a;
    AverageDoubleLists obj = new AverageDoubleLists();

    @Test
    void count1() {
        //Given
        a = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3, 4.4));
        //When
        int expected = 4;
        //Then
        assertEquals(expected, obj.count(a));
    }
    @Test
    void count2() {
        //Given
        a = new ArrayList<>(Arrays.asList(4.4, null , 2.2, 3.3));
        //When
        int expected = 4;
        //Then
        assertEquals(expected, obj.count(a));
    }

    @Test
    void sum1() {
        //Given
        a = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3, 4.4));
        //When
        double expected = 1.1 + 2.2 + 3.3 + 4.4;
        //Then
        assertEquals(expected, obj.sum(a));
    }
    @Test
    void sum2() {
        //Given
        a = new ArrayList<>(Arrays.asList(2.2, 0.0, 1.1, 3.3));
        //When
        double expected = 2.2 + 0.0 + 1.1 + 3.3;
        //Then
        assertEquals(expected, obj.sum(a));
    }

    @Test
    void average1() {
        //Given
        a = new ArrayList<>(Arrays.asList(4.4, 3.3, 2.2, 1.1));
        //When
        double expected = (4.4 + 3.3 + 2.2 + 1.1)/4;
        //Then
        assertEquals(expected, obj.average(a));
    }
    @Test
    void average2() {
        //Given
        a = new ArrayList<>(Arrays.asList(1.23, 23.4, 3.45, 45.6));
        //When
        double expected = (1.23 + 23.4 + 3.45 + 45.6)/4;
        //Then
        assertEquals(expected, obj.average(a));
    }
}