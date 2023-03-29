class Solution {
    public int romanToInt(String s) {
        
        int roman= 0;
        char[] ch =s.toCharArray();
        Map<Character, Integer> map= new HashMap <>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        
        for(int i=0;i<ch.length;i++){
            if( i!=ch.length-1 && map.get(ch[i])<map.get(ch[i+1]) ){
                roman=roman+ (map.get(ch[i+1])-map.get(ch[i])); 
                i=i+1;
            }
            else {
                roman=roman+ map.get(ch[i]);
            }    
        }
        
//         
//         while(j>=0){
//             if (j!=0 && ch[j]==('V') && ch[--j]==('I') ){
//                 System.out.println("in if loop");
//                 roman+=4;
//                 j=j-2;
                
//             }
                
//             // else if (ch[j]==('X') && ch[--j]==('I'))
//             //     roman+=9;
//             // else if (ch[j]==('L') && ch[--j]==('X'))
//             //     roman+=40;
//             // else if (ch[j]==('C') && ch[--j]==('X'))
//             //     roman+=90;
//             // else if (ch[j]==('D') && ch[--j]==('C'))
//             //     roman+=400;
//             else if (j!=0 && ch[j]==('M') && ch[--j]==('C')){
//                 roman+=900;
//                 j--;
//             }
                
//              else{
//                  // System.out.println(j);
//                  roman+=map.get(ch[j]);
//                   j--;
                 
//                  // System.out.println(roman);
//              }
                 
                
            
//         }
        return roman;
        
        
        
        
    }
}

// "III"
// "IV"
// "LVIII"
// "MCV"
// "XIV"
// "CIV"