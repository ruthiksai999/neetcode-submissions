class Solution {
    public boolean hasDuplicate(int[] nums) {
HashSet<Integer>Set = new HashSet<>();

for(int num : nums){
    if(!(Set.add(num))){
        return true;
    }
}
return false;
    }
}