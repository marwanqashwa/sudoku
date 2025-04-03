
fun main() {

}

fun sudokuChecker(sudoku: Array<Array<Char>>):Boolean{
    val sudokuToCheck=separateEachRowColumnSubgrid(sudoku)
    sudokuToCheck.forEach {
       if (!checkRowColumnSubgrid(it))return false
    }
    return true;
}

fun separateEachRowColumnSubgrid(arrayBeforeSeparate: Array<Array<Char>>): Array<Array<Char>>{
 val separatedSudoku = mutableListOf<Array<Char>>()



    return separatedSudoku.toTypedArray()
}

fun checkRowColumnSubgrid(row:Array<Char>):Boolean{

    return false
}
