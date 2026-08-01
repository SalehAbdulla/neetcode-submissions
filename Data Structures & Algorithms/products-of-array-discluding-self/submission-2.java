class Solution {
        public static int[] productExceptSelf(int[] nums) {
        // lets make an array same as the length of nums

        // product all element from right to left
        // [48, 24, 6, 1]
        int[] right = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int multRes = 1;
            while (j < nums.length) {
                multRes *= nums[j];
                j++;
            }
            right[i] = multRes;
        }

        // product all element from left to right
        int[] left = new int[nums.length];
        
        for (int i = left.length - 1; i >= 0; i--) {
            int j = i - 1;

            int multRes = 1;
            while (j >= 0)
            {
                multRes *= nums[j];
                j--;
            }
            left[i] = multRes;
        }


        int[] result = new int[nums.length];
        
        for (int i = 0; i < result.length; i++)
        {
            result[i] = left[i] * right[i];
        }


        return result;
    }
}  
