class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] arr=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            arr[j]=nums[i]*nums[i];
            j++;

        }
        Arrays.sort(arr);
        return arr;
    }
}