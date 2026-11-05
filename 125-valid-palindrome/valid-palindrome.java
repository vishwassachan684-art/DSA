class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int len = cleaned.length() -1;
        int i = 0;
        while(i < len){
            if(cleaned.charAt(i) != cleaned.charAt(len)) return false;
            i++;
            len--;
        }
        return true;
    }
}