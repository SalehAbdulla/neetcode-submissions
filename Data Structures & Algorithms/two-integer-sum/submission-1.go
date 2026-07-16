func twoSum(nums []int, target int) []int {
    complements := make(map[int]int)
    for i, n := range nums {
        if complement, ok := complements[n]; ok {
            return []int{complement, i}
        }
        complements[target-n] = i
    }
    return []int{}
}
