class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> wordsCount = new HashMap<>(), bannedCount = new HashMap<>();
        int maxCount=0;
        String mostCommon = null;
        List bannedList = Arrays.asList(banned);
        
        String[] words = paragraph.replaceAll("[^a-zA-Z ]", " ").toLowerCase().split("\\s+");
        for (int i =0; i <words.length;i++){
            wordsCount.put(words[i],wordsCount.getOrDefault(words[i],0)+1);
            if (bannedList.contains(words[i]))
                wordsCount.put (words[i],0); 
            
            if (wordsCount.get(words[i]) > maxCount) {
                maxCount = wordsCount.get(words[i]);
                mostCommon = words[i];
            }
        }
        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }    
            
        
        return mostCommon;
    }
}