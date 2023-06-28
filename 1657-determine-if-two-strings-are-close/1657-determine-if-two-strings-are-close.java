class Solution {
    public boolean closeStrings(String A, String B) {
        if (A.length()!=B.length() ) return false;
        
        if(A.equals(B)) return true;
        
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        
        for(char i: A.toCharArray()){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
        
        for(char i: B.toCharArray()){
            map2.put(i,map2.getOrDefault(i,0)+1);
        }
        if(!map1.keySet().equals(map2.keySet()))
            return false;
        
        ArrayList<Integer> list1= new ArrayList<>(map1.values());
        ArrayList<Integer> list2= new ArrayList<>(map2.values());
        
        Collections.sort(list1);
        Collections.sort(list2);
        
        return (list1.equals(list2));

    }
}