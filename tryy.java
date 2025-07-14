class tryy{

    public static int findMaxConsecutiveOnes(int[] nums){
        int ones = 0;
        int maxones=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                ones++;
                maxones = Math.max(ones,maxones);
            }else{
                ones=0;
            }
        }
        return maxones;
    }

    public static void main(String args[]) {
        int nums[] = { 1, 1, 1, 1, 1, 1 };
        int ans = findMaxConsecutiveOnes(nums);
        System.out.println("The maximum  consecutive 1's are " + ans);
    }
}