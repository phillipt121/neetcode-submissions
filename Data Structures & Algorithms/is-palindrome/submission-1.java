class Solution {
    public boolean isPalindrome(String s) {
        
        String rmS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int l = 0, r = rmS.length() - 1;
        while(l < r) {
            if(rmS.charAt(l)!=rmS.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
