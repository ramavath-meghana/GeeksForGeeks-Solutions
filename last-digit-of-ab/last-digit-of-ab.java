class Solution {
    public int getLastDigit(String a, String b) {

        // If exponent is 0, answer is always 1
        if (b.equals("0")) {
            return 1;
        }

        // Get the last digit of a
        int lastDigit = a.charAt(a.length() - 1) - '0';

        // Find b % 4
        int remainder = 0;

        for (char ch : b.toCharArray()) {
            remainder = (remainder * 10 + (ch - '0')) % 4;
        }

        // If remainder is 0, use the 4th position
        int power = remainder == 0 ? 4 : remainder;

        // Calculate lastDigit^power and keep only the last digit
        int answer = 1;

        for (int i = 0; i < power; i++) {
            answer = (answer * lastDigit) % 10;
        }

        return answer;
    }
}