class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0) return new ArrayList();
        
        HashMap<String,List> map = new HashMap<>();
        for (String str: strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList());
            }
            map.get(key).add(str);
            }
        return new ArrayList(map.values());
        }
}