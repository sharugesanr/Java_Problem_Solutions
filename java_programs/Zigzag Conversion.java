import java.util.*;
class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        List<StringBuilder> rows=new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            rows.add(new StringBuilder());
        }
        int curr=0;
        boolean down=false;
        for(int i=0;i<s.length();i++){
            rows.get(curr).append(s.charAt(i));

            if(curr==numRows-1 || curr==0){
                down=!down;
            }
            if(down){
                curr++;
            }
            else{
                curr--;
            }
            
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }
        return result.toString();


    }
}