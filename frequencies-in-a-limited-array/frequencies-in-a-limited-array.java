class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n + 1];

        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            result.add(freq[i]);
        }

        return result;
    }
}