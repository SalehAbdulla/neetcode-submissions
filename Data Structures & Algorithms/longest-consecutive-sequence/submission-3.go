func longestConsecutive(nums []int) int {
    if len(nums) == 0 {return 0}
    hashMap := make(map[int]bool)
    for _, num := range nums {hashMap[num]=true}
    max := 1
    for _, n := range nums {
        doesHaveANumBefore := hashMap[n-1]
        if doesHaveANumBefore {continue}
        subMax := 1
        curr := n
        for hashMap[curr+1] {
            subMax++
            curr++
        }
        if subMax > max {max = subMax;}
    }
    return max
}
