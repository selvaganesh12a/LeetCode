class Solution {
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[i].length/2; j++){
                swap(image[i], j, image[i].length-j-1);
            }
        }
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[i].length; j++){
                if(image[i][j] == 1){
                    image[i][j] = 0;
                }else{
                    image[i][j] = 1;
                }
            }
        }
        return image;
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}