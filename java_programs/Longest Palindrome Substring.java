import java.util.Stack;
class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==0 || s.length()==1){
            return s;
        }
        int start=0,maxlen=0; 
        for(int i=0;i<s.length();i++){
           int[] arr1=check(s,i,i);
           int left1=arr1[0];
           int right1=arr1[1];
            int len1=right1-left1+1;
            if(len1>maxlen){
                maxlen=len1;
                start=left1;
            }

            int[] arr2=check(s,i,i+1);
           int left2=arr2[0];
           int right2=arr2[1];
            int len2=right2-left2+1;
            if(len2>maxlen){
                maxlen=len2;
                start=left2;
            }

        }   return s.substring(start, start + maxlen);

    }


    public static int[] check(String s, int i, int j){
        while( i>=0 &&  j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return new int[]{i + 1, j - 1};
    }
}