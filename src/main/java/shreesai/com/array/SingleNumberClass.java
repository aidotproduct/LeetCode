package shreesai.com.array;

import java.util.HashSet;
import java.util.Set;

public class SingleNumberClass {
    public int singleNumber(int[] nums) {

        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0 ; i < nums.length; i++)
        {
            if(!set.add(nums[i]))
            {
                set.remove(nums[i]);
            }
        }
        return set.iterator().next();
    }
}
