class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int count=map.getOrDefault(nums[i],0);
            if(count<k){
                list.add(nums[i]);
                map.put(nums[i],count+1);
            }
        }
       int[] arr=new int[list.size()];
       for(int i=0;i<list.size();i++){
           arr[i]=list.get(i); 
       }
       return arr;
        
    }
}