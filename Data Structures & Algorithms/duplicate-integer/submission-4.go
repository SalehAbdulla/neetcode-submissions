func hasDuplicate(nums []int) bool {
    hashMap := make(map[int]bool)
    for _, n := range nums {
        if hashMap[n] {
            return true
        }
        hashMap[n] = true
    }
    return false
}

