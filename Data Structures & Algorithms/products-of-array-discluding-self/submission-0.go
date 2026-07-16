func productExceptSelf(nums []int) []int {
    left := make([]int, len(nums))
    left[0] = 1

    for i := 1; i < len(nums); i++ {
        left[i] = nums[i-1] * left[i-1]
    }
    
    right := make([]int, len(nums))
    right[len(right)-1] = 1
    
    for i := len(right)-2; i >= 0; i-- {
        right[i] = nums[i+1] * right[i+1]
    }

    result := make([]int, len(nums))
    for i := range result {
        result[i] = left[i] * right[i]
    }
    return result
}
