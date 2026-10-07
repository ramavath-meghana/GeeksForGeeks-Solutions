class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {

        ArrayList<Integer> elements = new ArrayList<>();

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        elements.add(min);
        elements.add(max);

        return elements;
    }
}