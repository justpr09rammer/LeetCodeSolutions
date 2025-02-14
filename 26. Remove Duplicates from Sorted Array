
public class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int i = 0;
        for(int num : nums){
            if(set.add(num)){
                nums[i] = num;
                i ++;
            }
        }
    
        return set.size();
    }
}
