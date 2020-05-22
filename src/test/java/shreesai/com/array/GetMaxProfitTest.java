package shreesai.com.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GetMaxProfitTest {

    GetMaxProfit profit = new GetMaxProfit();

    @Test
    public void getMaxProfitTest1()
    {
        int[] input = new int[]{7,1,5,3,6,4};
        int profitVal = profit.maxProfit(input);
        assertEquals(7 , profitVal);
    }


    @Test
    public void getMaxProfitTest2()
    {
        int[] input = new int[]{1,2,3,4,5};
        int profitVal = profit.maxProfit(input);
        assertEquals(4 , profitVal);
    }

    @Test
    public void getMaxProfitTest3()
    {
        int[] input = new int[]{7,6,4,3,1};
        int profitVal = profit.maxProfit(input);
        assertEquals(0 , profitVal);
    }
}
