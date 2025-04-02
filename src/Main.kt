/*
- - - | - - - | - - -
- - - | - - - | - - -
- - - | - - - | - - -
---------------------
- - - | - - - | - - -
- - - | - - - | - - -
- - - | - - - | - - -
---------------------
- - - | - - - | - - -
- - - | - - - | - - -
- - - | - - - | - - -

invalid row or column --> - 3 - | 7 - 6 | - 3 -   (There is repetition)

valid row or column   --> - 2 1 | 7 - 6 | - 3 -   (There is no repetition)

invalid 3*3 box       --> 5 - 4
                          - 6 -  (There is repetition)
                          7 5 -

valid 3*3 box         --> 6 - -
                          - 7 4  (There is no repetition)
                          5 9 -
*/

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
    return arrayOf()
}

fun checkRowColumnSubgrid(row:Array<Char>):Boolean{
    /*
 checkRowColumnSubgrid({- , - , - , - , - , - , - , - , -})--> true
 checkRowColumnSubgrid({- , 4 , 3 , - , 6 , - , - , - , -})--> true
 checkRowColumnSubgrid({1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9})--> true
 checkRowColumnSubgrid({1 , - , 6 , - , 4 , 1 , - , 2 , -})--> false
 checkRowColumnSubgrid({1 , - , 6 , - , 4 , 1 , - , 1 , -})--> false
    */
    return false
}
