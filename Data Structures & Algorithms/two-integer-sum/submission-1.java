class Solution {
    public int[] twoSum(int[] nums, int target) {
  Map<Integer,Integer>Hmap = new HashMap<>();
    for(int i = 0 ; i<nums.length;i++){
        int comp = target - nums[i];
      
        if(Hmap.containsKey(comp)){
          return new int[]{Hmap.get(comp),i};
          }
         Hmap.put(nums[i],i);
    }
    return new int[]{};

    }
}
