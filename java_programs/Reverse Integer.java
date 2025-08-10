class Solution {
    public int reverse(int x) {
        int re=0,temp=x;
        if(x<0){
            x=x*-1;
        }
        while(x>0){
            int e=x%10;
            if (re > Integer.MAX_VALUE / 10 || (re == Integer.MAX_VALUE / 10 && e > 7)) return 0;
            if (re < Integer.MIN_VALUE / 10 || (re == Integer.MIN_VALUE / 10 && e < -8)) return 0;
            re=(re*10)+e;
            x=x/10;
        }
        if(temp<0){
            re=re*-1;
        }
        
        return re;
    }
}