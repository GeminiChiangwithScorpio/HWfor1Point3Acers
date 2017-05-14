public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       boolean sig = false;
       Map<Integer,Integer> judge = new HashMap<Integer,Integer>(); 
       //the key of judge will be be the element in nums, and the value of judge will be  the index of nums
       for (int index=0;index<nums.length;index++){
           if(judge.containsKey(nums[index])){
               if(index-judge.get(nums[index]) <= k){
                   sig = true;
               }
           }
           judge.put(nums[index],index);
           
           
       }
       return sig;
    }
}