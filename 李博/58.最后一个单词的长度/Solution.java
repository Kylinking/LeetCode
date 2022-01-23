class Solution {
    public int lengthOfLastWord(String s) {
        String news=s.trim();
        int index=news.lastIndexOf(" ");
        int all=news.length()-1;
        return all-index;
    }
}