class Solution {
    public boolean isSubsequence(String s, String t) {
//         char[] sarr = s.toCharArray();
//         char[] tarr = t.toCharArray();

//         int i=0,j=0;
        
//         if(sarr.length<1) return true;
        
//         while (i<tarr.length){
//             if(sarr[j]==tarr[i]){
//                 j++;
//             }
//             i++;
//         }
//         if(j==sarr.length){
//             return true;
//         }
//         return false;    
//     }
// }
        
        int i=0,j=0;
    int n=t.length();
    int m=s.length();
    char ss[]=s.toCharArray();
    char tt[]=t.toCharArray();

    if(m<1)
        return true;

    while(i<n){
        if(tt[i]==ss[j]){
            j++;
        }
        i++;
        
    if(j==m)
        return true;
    }

        return false;
    }
}