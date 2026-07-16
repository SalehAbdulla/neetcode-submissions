func longestConsecutive(nums []int) int {
    max := 0
    hashMap := make(map[int]bool)
    for _, n := range nums {hashMap[n] = true}

    for _, n := range nums {
        if !hashMap[n-1] {
            subMax := 0
            for hashMap[n] {
                n++
                subMax++
            }
            if subMax > max {max = subMax}
        }
    }

    return max
}
