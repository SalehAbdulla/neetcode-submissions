func isAnagram(s string, t string) bool {
	if len(s) != len(t) {
		return false
	}
	sTape := getTape(s)
	tTape := getTape(t)

	for i := range len(sTape) {
		if sTape[i] != tTape[i] {
			return false
		}
	}
	
	return true
}


func getTape(s string)[]int{
	tape := make([]int, 26)
	for _, char := range s {
		tape[char-'a']++
	}
	return tape
}
