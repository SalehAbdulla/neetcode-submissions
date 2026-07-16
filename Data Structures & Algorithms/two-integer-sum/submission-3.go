func twoSum(nums []int, target int) []int {
    completion := map[int]int{}
    //.          target-n -> i
    for i, n := range nums {
        val, ok := completion[n]
        if ok {
            return []int{val, i}
        }
        completion[target-n] = i
    }
    return nums
}
