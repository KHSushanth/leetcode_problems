class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> main=new ArrayList<>();
        

        for(int i=0;i<numRows;i++){
            List<Integer> rows=new ArrayList<>();
            rows.add(1);

            for(int j=1;j<i;j++){
                int values=main.get(i-1).get(j-1)+main.get(i-1).get(j);
                rows.add(values);
            }
            if(i>0){
                rows.add(1);
            }
            main.add(rows);             



        }
        return main;
        
    }
}