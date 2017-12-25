package HashTables;

import java.util.HashMap;

/**
 * Created by Tien on 12/25/2017.
 *
 * Given an array of integers nums and an integer k, determine whether there are two distinct indices i and j in the array
 * where nums[i] = nums[j] and the absolute difference between i and j is less than or equal to k.

 Example

 For nums = [0, 1, 2, 3, 5, 2] and k = 3, the output should be
 containsCloseNums(nums, k) = true.

 There are two 2s in nums, and the absolute difference between their positions is exactly 3.

 For nums = [0, 1, 2, 3, 5, 2] and k = 2, the output should be

 containsCloseNums(nums, k) = false.

 The absolute difference between the positions of the two 2s is 3, which is more than k.
 */
public class ContainsCloseNums {

    //O(n^2) Time complexity
    boolean containsCloseNums1(int[] nums, int k) {
        for(int i = 0; i < nums.length-1; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j] && j - i <= k)
                    return true;
            }
        }
        return false;
    }

    //O(n) Time complexity
    boolean containsCloseNums(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int i = 0;
        for(int n : nums) {
            if(hm.containsKey(n))
                if(i - hm.get(n) <= k) return true;
            hm.put(n, i++);
        }
        return false;
    }
}
