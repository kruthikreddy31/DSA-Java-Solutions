class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // shift to 0-based
            ans.append((char) ('A' + (columnNumber % 26)));
            columnNumber /= 26;
        }

        return ans.reverse().toString();
    }
}