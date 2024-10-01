class Solution {
    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int target = 0;
        int avail = 0;

        if(nums1.length == 1 && nums2.length == 1){
            if(nums1[0] == nums2[0]){
                return new int[]{nums1[0]};
            }
        }

        for (int i = 0; i < nums1.length; i++) {
            target = nums1[i];
            avail = binary(nums2, 0, nums2.length -1, target);
            if(avail != -1 && !temp.contains(nums2[avail])){
                temp.add(nums2[avail]);
            }
        }

        int[] ans = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            ans[i] = temp.get(i);
        }

        return ans;
    }

    static int binary(int[] nums,int start,int end,int target){
        int mid = 0;

        while(start <= end){
            mid = (start + end) / 2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return -1;
    }
}