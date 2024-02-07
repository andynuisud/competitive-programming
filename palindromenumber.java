class Solution {
    public boolean isPalindrome(int x) {
        String converted = x +  "";
        String palendrome = "";

        for(int i = converted.length()-1; i >= 0; i--){
            palendrome = palendrome + converted.charAt(i);
        }

        if(converted.equals(palendrome)){
            return true; 
        }
        return false; 
    }
}
