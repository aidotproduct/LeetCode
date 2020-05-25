package shreesai.com.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateClass {

    public boolean constrainsDuplicate(int[] nums) {
        Set set = new HashSet();

        for(int i = 0 ; i < nums.length; i++ )
        {
            if(set.contains(nums[i]))
                return true;
            else
                set.add(nums[i]);
        }
        return false;
    }
}
