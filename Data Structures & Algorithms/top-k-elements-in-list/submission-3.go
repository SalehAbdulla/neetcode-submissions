func topKFrequent(nums []int, k int) []int {
    // HashMap
    hashMap := make(map[int]int) // num -> occure
    for _, n := range nums {hashMap[n]++}
    // BucketSort // +1 because first bucket unused
    buckets := make([][]int, len(nums)+1)
    for k, v := range hashMap {
        buckets[v] = append(buckets[v], k)
    }
    // look till < k, return
    var result []int
    for i := len(buckets) - 1; i >= 0; i-- {
        for _, n := range buckets[i] {
            result = append(result, n)
            if len(result) == k {return result}
        }
    }

    return result
}