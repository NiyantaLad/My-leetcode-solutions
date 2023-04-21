class Solution {
    public String[] findWords(String[] words) {
        
        String frow = "qwertyuiop";
        String srow = "asdfghjkl";
        String trow = "zxcvbnm";   
        List<String> output = new ArrayList<>();
        for (int i=0; i< words.length;i++){
            int fcount=0, scount=0,tcount=0;
            int wlen = words[i].length();
            for (int j=0; j<wlen;j++){
                
                if (frow.contains(Character.toString(Character.toLowerCase((words[i].charAt(j))))))
                    fcount++;
                else if (srow.contains(Character.toString(Character.toLowerCase(words[i].charAt(j)))))
                    scount++;
                else if (trow.contains(Character.toString(Character.toLowerCase(words[i].charAt(j)))))
                    tcount++;
                
                if (fcount== wlen || scount == wlen || tcount==wlen)
                    output.add(words[i]);
            }

        }
        
        
        String ans[] = new String[output.size()];
        output.toArray(ans);
        return ans;
    }
}