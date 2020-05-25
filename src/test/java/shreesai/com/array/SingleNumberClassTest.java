package shreesai.com.array;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;

import java.util.NoSuchElementException;

public class SingleNumberClassTest {
    SingleNumberClass singleNumberClass = new SingleNumberClass();

    @Test
    public void singleNumberTest1()
    {
        int[] input = new int[]{2,2,1};
        int output = singleNumberClass.singleNumber(input);
        assertEquals(1,output);
    }

    @Test
    public void singleNumberTest2()
    {
        int[] input = new int[]{4,1,2,1,2};
        int output = singleNumberClass.singleNumber(input);
        assertEquals(4,output);
    }

    @Test
    public void singleNumberTest3()
    {
        int[] input = new int[]{2,2,1,1};
        assertThrows(NoSuchElementException.class,
                () -> singleNumberClass.singleNumber(input));
    }
}
