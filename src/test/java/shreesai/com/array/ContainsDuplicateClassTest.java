package shreesai.com.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContainsDuplicateClassTest {

    ContainsDuplicateClass containsDuplicateClass = new ContainsDuplicateClass();

    @Test
    public void containsDuplicateTest1()
    {
        int[] input = new int[]{1,2,3,1};
        boolean result = containsDuplicateClass.constrainsDuplicate(input);
        assertEquals(true,result);
    }

    @Test
    public void containsDuplicateTest2()
    {
        int[] input = new int[]{1,2,3,4};
        boolean result = containsDuplicateClass.constrainsDuplicate(input);
        assertEquals(false,result);
    }

    @Test
    public void containsDuplicateTest3()
    {
        int[] input = new int[]{1,1,1,3,3,4,3,2,4,2};
        boolean result = containsDuplicateClass.constrainsDuplicate(input);
        assertEquals(true,result);
    }

}
