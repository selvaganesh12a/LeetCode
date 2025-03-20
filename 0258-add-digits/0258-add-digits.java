class Solution {
    public int addDigits(int num) {
        int pv = 1, temp = num;
        
        while(num > 9){
            pv = 1;
            while(temp >= 10){
            pv *= 10;
            temp /= 10;
            }
            temp = 0;
            while(pv != 0){
                temp += (num/pv)%10;
                pv /= 10;
            }
            num = temp;
        }
        return num;
    }
}