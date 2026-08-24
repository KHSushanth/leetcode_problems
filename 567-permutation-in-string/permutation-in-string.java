class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if (n > m) return false;
       
        String sortedS1 = sortString(s1);

       
        for (int i = 0; i <= m - n; i++) {
            String sub = s2.substring(i, i + n);
            if (sortString(sub).equals(sortedS1)) {
                return true;
            }
        }

        return false;
    }

   
    private String sortString(String str) {
        char[] arr = str.toCharArray();
        java.util.Arrays.sort(arr);
        return new String(arr);
    }
}
