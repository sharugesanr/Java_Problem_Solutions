class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder str=new StringBuilder();
        int len=0;
        if(s.length()!=0){
                str.append(s.charAt(0));
                
        }

        for (int i=1;i<s.length();i++){
                if (str.toString().indexOf(s.charAt(i)) != -1){
                    int index=str.toString().indexOf(s.charAt(i));
                    if(len < str.length()){
                    len=str.length();}
                if (index != -1) {
                str.delete(0, index + 1);  }
                    str.append(s.charAt(i));
                }
                else{
                    str.append(s.charAt(i));
                }
            
            
        }
        return Math.max(len, str.length());
    }
}