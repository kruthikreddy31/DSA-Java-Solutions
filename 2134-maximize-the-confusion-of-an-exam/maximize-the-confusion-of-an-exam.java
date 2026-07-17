class Solution {

    public int helper(String s, int k, char target) {

        int i = 0;
        int change = 0;
        int max = 0;

        for (int j = 0; j < s.length(); j++) {

            if (s.charAt(j) != target)
                change++;

            while (change > k) {

                if (s.charAt(i) != target)
                    change--;

                i++;
            }

            max = Math.max(max, j - i + 1);
        }

        return max;
    }

    public int maxConsecutiveAnswers(String answerKey, int k) {

        return Math.max(
                helper(answerKey, k, 'T'),
                helper(answerKey, k, 'F')
        );
    }
}