class Solution {
    public boolean checkIfPangram(String sentence) {
        //char[] characters = new char[sentence.length()];
         Set<Character> characters = new HashSet<>();


        for(int c  = 0; c < sentence.length(); c++){
            char character = sentence.charAt(c);
            if( character >= 'a' && character <= 'z'){
                characters.add(character);
            }
        }
        return characters.size() == 26;
    }
}