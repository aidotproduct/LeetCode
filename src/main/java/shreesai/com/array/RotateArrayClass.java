package shreesai.com.array;

public class RotateArrayClass {
    public void rotate_brut(int[] nums, int k) {

        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i ++)
        {
            int destination = i + k ;
            if(destination >= nums.length)
            {
                destination = destination % nums.length;
            }
            result[destination] = nums[i];
        }
        nums = result;
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for(int i = 0; count < nums.length; i ++) {
            int currentIdx = i;
            int prev = nums[i];
            do {
                int nextIdx = (currentIdx + k) % nums.length;
                int temp = nums[nextIdx];
                nums[nextIdx] = prev;
                prev = temp;
                currentIdx = nextIdx;
                count++;
            } while (i != currentIdx);
        }
    }
}
