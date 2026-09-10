class Solution {
    public int findLucky(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int number = entry.getKey();
            int frequency = entry.getValue();

            if (number == frequency) {
                max = Math.max(max, number);
            }
        }

        return max;
    }
}