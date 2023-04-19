class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        
        String[] words = s.split(" ");
        
        Map<Character,String> ptosmap = new HashMap<>();
        Map<String,Character> stopmap = new HashMap<>();
       
        
        if (words.length != pattern.length())
            return false;
        for(int i=0; i< pattern.length();i++){
            char ch= pattern.charAt(i);
            if(ptosmap.containsKey(ch)){
                if(!(ptosmap.get(ch).equals(words[i])))
                    return false;
            }
            ptosmap.put(ch,words[i]);
            
            if(stopmap.containsKey(words[i])){
                if(!(stopmap.get(words[i]).equals(ch)))
                    return false;
            }
            stopmap.put(words[i],ch);
        }
        return true;
    }
}