class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        // 1). replace the punctuations with spaces,
        // and put all letters in lower case
        String normalizedStr = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ").toLowerCase();

        // 2). split the string into words
        String[] words = normalizedStr.split("\\s+");

        Set<String> bannedWords = new HashSet();
        for (String word : banned)
            bannedWords.add(word);

        Map<String, Integer> wordCount = new HashMap();
        // 3). count the appearance of each word, excluding the banned words
        for (String word : words) {
            if (!bannedWords.contains(word))
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // 4). return the word with the highest frequency
        return Collections.max(wordCount.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
// class Solution {
//     public String mostCommonWord(String paragraph, String[] banned) {
//         Map<String, Integer> wordsCount = new HashMap<>(), bannedCount = new HashMap<>();
//         int maxCount=0;
//         String mostCommon = null;
//         List bannedList = Arrays.asList(banned);
        
//         String[] words = paragraph.replaceAll("[^a-zA-Z ]", " ").toLowerCase().split("\\s+");
//         for (int i =0; i <words.length;i++){
//             wordsCount.put(words[i],wordsCount.getOrDefault(words[i],0)+1);
//             if (bannedList.contains(words[i]))
//                 wordsCount.put (words[i],0); 
            
//             if (wordsCount.get(words[i]) > maxCount) {
//                 maxCount = wordsCount.get(words[i]);
//                 mostCommon = words[i];
//             }
//         }
//         for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
//             System.out.println(entry.getKey() + ": " + entry.getValue());
//         }    
            
        
//         return mostCommon;
//     }
// }