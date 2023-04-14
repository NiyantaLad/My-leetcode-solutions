class Solution {
    public char findTheDifference(String s, String t) {
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        
        Map<Character, Integer> map = new HashMap<>();
        for (int i =0; i<sarr.length;i++){
            if (!map.containsKey(sarr[i])){
                map.put(sarr[i],1);
            }
            else
                map.put(sarr[i], map.get(sarr[i]) + 1);
        }
        
        for (int j =0; j<tarr.length;j++){
            if (!map.containsKey(tarr[j])){
                return tarr[j];
            }
            else {
                if (map.get(tarr[j])==0)
                    return tarr[j];
                else {
                    map.put(tarr[j], map.get(tarr[j]) - 1);
                }
            }

        }
        return 0;
    }
}