public class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean sig =false;
        Set<Integer> judge = new HashSet<Integer>();
        for (int ele : nums){
            if(judge.contains(ele)){
                sig = true;
            }
            judge.add(ele);
        }
        return sig;
    
     
       
    }
}