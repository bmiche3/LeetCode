//Given Strings A and B, check if B is a rotation of A.


class Solution {
    public boolean rotateString(String a, String b) {
        if(a.length() != b.length()){
            return false;
        } 
        return (a+a).contains(b);
    }
}