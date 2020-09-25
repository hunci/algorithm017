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

    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length -1;
        int res = 0;
        while(i < j){
            res = height[i] < height[j] ?
                  Math.max(res, (j - i) * height[i++])  :
                  Math.max(res, (j - i) * height[j--])

        }
        return res;
    }
}