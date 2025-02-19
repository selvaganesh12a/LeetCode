class Solution {
    public static int dayOfYear(String date) {
        int ans = 0;
        int year = 0;
        for(int i = 0;i < 4; i++){
            char temp = date.charAt(i);
            year = (year*10) + Integer.parseInt(String.valueOf(temp));
        }
        int month = 0;
        for(int i = 5;i < 7; i++){
            char temp = date.charAt(i);
            month = (month*10) + Integer.parseInt(String.valueOf(temp));
        }
        int d = 0;
        for(int i = 8;i < date.length() ; i++){
            char temp = date.charAt(i);
            d = (d*10) + Integer.parseInt(String.valueOf(temp));
        }

        for(int i = 1; i < month; i++){
            if(i == 1 || i == 3 || i == 5 || i ==  7 || i == 8 || i == 10 || i == 12){
                ans += 31;
            }else if( i != month && i != 2){
                ans += 30;
            }
            if(i != month && i == 2 && leap(year)){
                ans += 29;
            }else if(i != month && i == 2){
                ans += 28;
            }
        }
        ans += d;
        return ans;
    }
    public static boolean leap(int n){
        boolean is_leap_year = false;
        if (n % 4 == 0) {
            is_leap_year = true;
            if (n % 100 == 0) {
                if (n % 400 == 0)
                    is_leap_year = true;
                else
                    is_leap_year = false;
            }
        }
        else
            is_leap_year = false;

        return is_leap_year;
    }
}