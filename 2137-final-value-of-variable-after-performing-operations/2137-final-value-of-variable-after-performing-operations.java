class Solution {
    public  static int finalValueAfterOperations(String[] operations){
        int x=0;
        	for(int i = 0;i < operations.length; i++)
    {
		if(operations[i].charAt(1) == '+') x++;
		else x--;
	}

	return x;        
}
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("operations = ");
        String[] operations = new String[in.nextInt()];
        System.out.println(finalValueAfterOperations(operations));
    }
}