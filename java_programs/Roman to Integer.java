class Solution {
    public int romanToInt(String s) {
        int result=0;
        Map<Character, Integer> rm=new HashMap<>();
        rm.put('I',1);
        rm.put('V',5);
        rm.put('X',10);
        rm.put('L',50);
        rm.put('C',100);
        rm.put('D',500);
        rm.put('M',1000);
        for (int i=0;i<s.length();i++){
            char cur=s.charAt(i);
            if((i+1)!=s.length()){
            char nex=s.charAt(i+1);
            int curv=rm.get(cur);
            int nexv=rm.get(nex);
                        if(curv<nexv){
                result+=(nexv-curv);
                i++;
            }
            else{
                result+=curv;
            }}
            else{
                int curv=rm.get(cur);
                result+=curv;
            }
        }
        return result;
    }
    
}