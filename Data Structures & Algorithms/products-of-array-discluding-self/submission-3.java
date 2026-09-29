class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length == 0) return nums;
        int[] products = new int[nums.length];
        int total = 1;
        int containsZero = 0;
        boolean containsOne = false;
        for(int num:nums){
            if(num == 0)
            {
                containsZero++;

            } else if(num == 1){
                containsOne = true;
            } else {
                total*=num;
            }
            
        }
        if(total == 1 && !containsOne) total = 0;
        for(int i = 0; i < products.length; i++)
        {
            if(containsZero == 0){
                products[i] = total / nums[i];
            } else if(containsZero == 1) 
            {
                if(nums[i] != 0)
                {
                    products[i] = 0;
                } else {
                    products[i] = total;
                }
            } else {
                products[i] = 0;
            }
            
        }
        return products;
    }
}  
