package tyagiabhinav.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        combine(nums, target, 0, 0, new LinkedList<>(), res);
        return res;
    }

    private void combine(int[] nums, int t, int pos, int sum, LinkedList<Integer> list, List<List<Integer>> res){
        if(sum == t){
            res.add(new ArrayList<>(list));
            return;
        }
        if(sum > t){
            return;
        }
        for(int i=pos; i<nums.length; i++){
            sum += nums[i];
            list.add(nums[i]);
            combine(nums, t, i, sum, list, res);
            sum -= nums[i];
            list.removeLast();
        }
    }
}
