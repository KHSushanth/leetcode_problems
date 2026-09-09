class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        List<Boolean> bo=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
            
        }
        for(int j=0;j<candies.length;j++){
            bo.add(candies[j]+extraCandies>=max);
        }
        return bo;
        
    }
}