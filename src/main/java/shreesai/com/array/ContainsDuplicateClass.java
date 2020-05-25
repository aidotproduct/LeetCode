package shreesai.com.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateClass {

    public boolean constrainsDuplicate(int[] nums) {
        Set set = new HashSet();

        for(int i = 0 ; i < nums.length; i++ )
        {
            if(!set.add(nums[i]))
                return true;
        }
        return false;
    }
}
