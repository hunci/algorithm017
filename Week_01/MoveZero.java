public class MoveZero {
    public int moveZero(int[]  nums) {
        int index = 0;
        for(int n : nums){
            if(n != 0) {
                nums[index++] = n;
            }
        }

        while(inde<nums.length){
            nums[index++]=0;
        }

    }
}