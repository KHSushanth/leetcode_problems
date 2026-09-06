class Solution {
    public void moveZeroes(int[] nums) {
        int[] arr=new int[nums.length];
        Arrays.fill(arr,0);
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                arr[i]=nums[j];
                i++;
            }


        }
        
        for(int j=0;j<nums.length;j++){
            nums[j]=arr[j];
           

        }
        
    }
}