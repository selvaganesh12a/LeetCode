class Solution {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(int i = 0; i < items.size(); i++){
            for(int j = 0; j < items.get(i).size(); j++){
                if(j == 0 && ruleKey.equals("type") && ruleValue.equals(items.get(i).get(j))){
                    count+=1;
                }
                if(j == 1 && ruleKey.equals("color") && ruleValue.equals(items.get(i).get(j))){
                    count+=1;
                }
                if(j == 2 && ruleKey.equals("name") && ruleValue.equals(items.get(i).get(j))){
                    count+=1;
                }
            }
        }
        return count;
    }
}