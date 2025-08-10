class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        String op="({[";

        for (int i=0;i<s.length();i++){
            if(op.contains(String.valueOf(s.charAt(i)))){
            stack.push(s.charAt(i));

            }
            
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char now=stack.pop();
                    if(s.charAt(i)==']' && now !='['){
                        return false;
                    }
                    if(s.charAt(i)==')' && now !='('){
                        return false;
                    }
                    if(s.charAt(i)=='}' && now !='{'){
                        return false;
                    }

                }
            }

        }if(!stack.isEmpty()){
        return false;}
        return true;
        }

        
    }