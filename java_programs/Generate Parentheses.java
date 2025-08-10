import java.util.ArrayList;
class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> arr=new ArrayList<>();
        StringBuilder str=new StringBuilder();
        int open=0,close=0;
        check(arr,str,open,close,n);
        return arr;
        
    }
    public static List check(List arr,StringBuilder str,int open,int close,int max){
        if(str.length()==2*max){
            arr.add(str.toString());
            return arr;
        }
        if(open<max){
            str.append('(');
            check(arr,str,open+1,close,max);
            str.deleteCharAt(str.length() - 1);
        }
        if(close<open){
            str.append(')');
            check(arr,str,open,close+1,max);
            str.deleteCharAt(str.length() - 1);
        }
        return arr;
    }

}