type Solution struct {}

func (s *Solution) Encode(strs []string) (result string) {
    for _, str := range strs {
        result += strconv.Itoa(len(str)) + "#" + str
    }
    return
}
// 4#neet4#code
func (s *Solution) Decode(str string) (result []string) {
    i := 0
    for i < len(str) {
        j := i
        for str[j] != '#' {j++}
        getLength, _ := strconv.Atoi(str[i:j])
        i = j + 1
        result = append(result, str[i:i+getLength])
        i += getLength
    }
    return
}