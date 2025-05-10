class Solution {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder();
        word.append('a');

        if(k > 2){
            return find(word,k);
        }else{
            if(k == 1) return 'a';
            else return 'b';
        }
    }

    public char find(StringBuilder word, int k){
        if(word.length() >= k){
            return word.charAt(k - 1);
        }
        StringBuilder generated = new StringBuilder();
        for(int i = 0; i < word.length(); i++){
            generated.append((char)(word.charAt(i) + 1));
        }
        word.append(generated);
        return find(word,k);
    }
}