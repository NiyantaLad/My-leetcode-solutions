class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();        
        ArrayList<Integer> list1= new ArrayList<Integer>();
        ArrayList<Integer> list2= new ArrayList<Integer>();
        List<List<Integer>> result = new ArrayList<>();
        
        for(int n1:nums1){
            set1.add(n1);
        }        
        for(int n2:nums2){
            set2.add(n2);
        } 
        
        for(int s:set1){
            if(!set2.contains(s))
                list1.add(s);
        }
        
        for(int i:set2){
            if(!set1.contains(i))
                list2.add(i);
        }
        
        result.add(list1);
        
        result.add(list2);
        return result;
    }
}

// class Solution {
//     public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
//         ArrayList<Integer> list1= new ArrayList<Integer>();
//         ArrayList<Integer> list2= new ArrayList<Integer>();
//         List<List<Integer>> result = new ArrayList<>();
//         for(int n1:nums1){
//             list1.add(n1);
//         }        
//         for(int n2:nums2){
//             list2.add(n2);
//         }        
//         list1.removeAll(list2);
//         System.out.println(list1);
//         result.add(list1);
//         System.out.println(result);
//         list1.clear();
//         for(int n1:nums1){
//             list1.add(n1);
//         }      
//         list2.removeAll(list1);
//         System.out.println(list2); 
//         result.add(list2);
//         System.out.println(result);
//         return result;
//     }
// }