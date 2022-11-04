import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LoadAndStoreTest {

    // write all these out too.
    String integerFile = "/Users/freddy/Projects/ArraysAndLists/testIntegerData1.txt";
    String doubleFile = "/Users/freddy/Projects/ArraysAndLists/testDoubleData2.txt";
    String stringFile = "/Users/freddy/Projects/ArraysAndLists/testStringData3.txt";
    LoadAndStore loading = new LoadAndStore();
    String intArray = Arrays.toString(loading.loadIntArrayFromFile(integerFile));
    String intList = String.valueOf(loading.loadIntegerArrayListFromFile(integerFile));
    String doubleArray = Arrays.toString(loading.loaddoubleArrayFromFile(doubleFile));
    String doubleList = String.valueOf(loading.loadDoubleArrayListFromFile(doubleFile));
    String stringArray = Arrays.toString(loading.loadStringArrayFromFile(stringFile));
    String stringList = String.valueOf(loading.loadStringArrayListFromFile(stringFile));


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void loadIntArrayFromFile() {
        assertEquals(intList, intArray);
    }

    @Test
    void loadIntegerArrayListFromFile() {
        assertEquals(intArray, intList);
    }

    @Test
    void loaddoubleArrayFromFile() {
        assertEquals(doubleList, doubleArray);
    }

    @Test
    void loadDoubleArrayListFromFile() {
        assertEquals(doubleArray, doubleList);
    }

    @Test
    void loadStringArrayFromFile() {
        assertEquals(stringList, stringArray);
    }

    @Test
    void loadStringArrayListFromFile() {
        assertEquals(stringArray, stringList);
    }
}