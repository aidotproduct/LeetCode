package shreesai.com.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RotateArrayTest {

    RotateArray rotateArray = new RotateArray();

    @Test
    public void rotateArrayTest1()
    {
        int[] input = new int[]{1,2,3,4,5,6,7};
        int[] expectedOutput = new int[]{5,6,7,1,2,3,4};
        int step = 3;
        rotateArray.rotate(input, step);
        assertArrayEquals(expectedOutput,input);
    }

    @Test
    public void rotateArrayTest2()
    {
        int[] input = new int[]{-1,-100,3,99};
        int[] expectedOutput = new int[]{3,99,-1,-100};
        int step = 2;
        rotateArray.rotate(input, step);
        assertArrayEquals(expectedOutput,input);
    }

}
