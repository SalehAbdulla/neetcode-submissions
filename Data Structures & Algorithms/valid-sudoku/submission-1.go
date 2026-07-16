func isValidSudoku(board [][]byte) bool {

    rowMap := make([]map[byte]bool, 9)
    colMap := make([]map[byte]bool, 9)
    boxMap := make([]map[byte]bool, 9)

    // -----------------

    for i := 0; i < 9; i++ {
        rowMap[i] = make(map[byte]bool)
        colMap[i] = make(map[byte]bool)
        boxMap[i] = make(map[byte]bool)
    }

    // -----------------
    
    getBoxIndex := func(row, col int) int {
        return (row / 3)*3 + (col/3)
    }
    
    // -----------------

    for i := 0; i < 9; i++ {
        for j := 0; j < 9; j++ {
            val := board[i][j]
            if val == '.' {continue}
            
            if rowMap[i][val] {return false}
            if colMap[j][val] {return false}
            if boxMap[getBoxIndex(i, j)][val] {return false}

            rowMap[i][val] = true
            colMap[j][val] = true
            boxMap[getBoxIndex(i, j)][val] = true

        }
    }

    return true
}
