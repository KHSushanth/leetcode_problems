class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            int ascii=(int)ch;
            String binary=String.format("%8s",Integer.toBinaryString(ascii)).replace(' ','0');
            
            sb.append(binary);



        }
        int l=0;
        int r=sb.length()-1;
        while(l<r){
            if(sb.charAt(l)!=sb.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
        
        
    

        
    }
}