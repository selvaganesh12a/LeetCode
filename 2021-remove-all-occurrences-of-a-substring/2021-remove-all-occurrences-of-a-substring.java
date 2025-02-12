class Solution {
    public String removeOccurrences(String s, String part) {
        s = s.replaceFirst(part,"");
        if (s.contains(part)){
            return removeOccurrences(s,part);
        }else{
            return s;
        }
    }
}