package shreesai.com.array;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicateFromSortedArrayTest {
    RemoveDuplicatesClass arrayClass = new RemoveDuplicatesClass();

    @Test
    public void removeDuplicatesTest1()
    {
        int[] nums  = {1,1,2};
        int length = arrayClass.removeDuplicates(nums);
        int[] arrayToCompare = Arrays.copyOfRange(nums,0,length);
        assertArrayEquals(new int[] {1,2},
                arrayToCompare);
        assertEquals(2, length);
    }

    @Test
    public void removeDuplicatesTest2()
    {
        int[] nums = null;
        int length = arrayClass.removeDuplicates(nums);
        assertEquals(0, length);

    }

    @Test
    public void removeDuplicatesTest3()
    {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int length = arrayClass.removeDuplicates(nums);
        int[] arrayToCompare = Arrays.copyOfRange(nums,0,length);
        assertArrayEquals(new int[] {0,1,2,3,4},
                arrayToCompare);
        assertEquals(5, length);

    }

}
