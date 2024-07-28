import java.util.Arrays;

public class problem34 {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        boolean flag=false;
        if (nums.length>0){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                result[0]=i;
                flag = true;
                break;
            }
        }
        if(flag==false){
            result = new int[]{-1,-1};
            return result;
        }
        for (int j = nums.length-1; j >=0; j--) {
            if(nums[j]==target){
                result[1]=j;
                break;
            }
        }
        return result;
        }
        else{
            result= new int[]{-1, -1};
            return result;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2};
        int target = 2;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}
