class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        if(s.length() <=1){
            return s.length();
        }
        int length = 0;
        for(int i=0, j=0; j<s.length(); j++){
            if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j))+1, i);
            }
            length = Math.max(length, j-i+1);
            map.put(s.charAt(j), j);
        }
        return length;
    }
}