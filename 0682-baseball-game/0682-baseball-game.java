class Solution {
    public int calPoints(String[] operations) {
        Stack<String> st = new Stack<>();
        for(String i: operations){
            if(!i.equals("C") && !i.equals("D") && !i.equals("+")) st.push(i);
            else if(i.equals("D")){
                int val = Integer.parseInt(st.peek());
                int newVal = val * 2;
                st.push(String.valueOf(newVal));
            }else if(i.equals("C")){
                st.pop();
            }else if(i.equals("+")){
                int b = Integer.parseInt(st.peek());
                st.pop();
                int a = Integer.parseInt(st.peek());
                int c = a+b;
                st.push(String.valueOf(b));
                st.push(String.valueOf(c));
            }
        }
        int ans = 0;
        while(!st.empty()){
            ans += Integer.parseInt(st.pop());
        }
        return ans;
    }
}