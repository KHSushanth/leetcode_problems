class Solution {
    public void reverseString(char[] s) {
        ArrayList<Character> list=new ArrayList<>();
        Stack<Character> stack=new Stack<>();
        for(char n:s){
            stack.push(n);

        }
        int i=0;
        while(!stack.isEmpty()){
            s[i++]=stack.pop();
        }
        
    }
}