class Solution {
    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        HashSet<Character> map = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) {
            map.add(allowed.charAt(i));
        }
        for (String a : words) {
            boolean flag = false;
            for (char b : a.toCharArray()) {
                if(!map.contains(b)){
                    flag = true;
                }
                if (flag) {
                    break;
                }
            }
            if(!flag){
                count += 1;
            }
        }

        return count;
    }
}