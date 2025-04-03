 open class SudokuChecker {

    fun sudokuCheckValidation(sudoku: Array<Array<Char>>):Boolean{
        if (!checkLen(sudoku))return false
        if (!checkValidationOfChar(sudoku))return false
        val sudokuToCheck=separateEachRowColumnSubgrid(sudoku)

        sudokuToCheck.forEach {
            if (!checkRowColumnSubgrid(it))return false
        }
        return true;
    }

   private fun separateEachRowColumnSubgrid(arrayBeforeSeparate: Array<Array<Char>>): Array<Array<Char>>{
        val separatedSudoku = mutableListOf<Array<Char>>()
        arrayBeforeSeparate.forEach {separatedSudoku.add(it)}//rows
        for (columnIndex in 0 until 9){
            val column = Array(9) { '-' }; for (i in 0 until 9){
                column[i]=arrayBeforeSeparate[i][columnIndex]
            }
            separatedSudoku.add(column)
        }//column



        for (startRow in listOf(0, 3, 6)) {
            for (startCol in listOf(0, 3, 6)) {
                val subgrid = Array(9) { '-' }
                var index = 0
                for (row in startRow until startRow + 3) {
                    for (col in startCol until startCol + 3) {
                        subgrid[index] = arrayBeforeSeparate[row][col]
                        index++
                    }
                }
                separatedSudoku.add(subgrid)
            }//subgrid
        }

        return separatedSudoku.toTypedArray()
    }

   private fun checkRowColumnSubgrid(row:Array<Char>):Boolean{

       val seen = mutableSetOf<Char>()
       for (cell in row) {
           if (cell != '-' && !seen.add(cell)) {
               return false
           }
       }
       return true
    }

   private fun checkValidationOfChar(arrayBeforeSeparate: Array<Array<Char>>):Boolean{

        for (row in arrayBeforeSeparate) {
            for (cell in row) {
                if (cell !in '1'..'9' && cell != '-') {
                    return false
                }
            }
        }
        return true


    }

   private fun checkLen(arrayBeforeSeparate: Array<Array<Char>>):Boolean{
       arrayBeforeSeparate.forEach { if (it.size != 9) return false }
       return true
    }
}