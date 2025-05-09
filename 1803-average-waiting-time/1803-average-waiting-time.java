class Solution {
    public double averageWaitingTime(int[][] customers) {
        ArrayList<Integer> chef = new ArrayList<>();
        int temp = customers[0][0] + customers[0][1];
        chef.add(temp);

        for(int i = 1; i < customers.length; i++){
            if(temp >= customers[i][0]){
                temp += customers[i][1];
                chef.add(temp);
            }else{
                temp = customers[i][0];
                temp += customers[i][1];
                chef.add(temp);
            }
        }

        double wait = 0;
        for(int i = 0; i < customers.length; i++){
            wait += (chef.get(i) - customers[i][0]);
        }

        double ans = wait/chef.size();
        return ans;
    }
}