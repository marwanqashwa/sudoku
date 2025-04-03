

class Test {
    companion object :SudokuChecker(){
        fun checksSudoku() {
            check(
                name = "valid sudoku all complete",
                correctRes = true,
                res = sudokuCheckValidation(arrayOf(
                    arrayOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
                    arrayOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
                    arrayOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
                    arrayOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
                    arrayOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
                    arrayOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
                    arrayOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
                    arrayOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
                    arrayOf('3', '4', '5', '2', '8', '6', '1', '7', '9')
                ))
            )
            check(
                name = "valid sudoku not complete",
                correctRes = true,
                res = sudokuCheckValidation(arrayOf(
                    arrayOf('5', '3', '4', '-', '-', '8', '9', '1', '2'),
                    arrayOf('6', '7', '-', '1', '9', '5', '3', '4', '8'),
                    arrayOf('1', '9', '8', '3', '-', '2', '5', '6', '7'),
                    arrayOf('8', '-', '9', '7', '6', '1', '4', '2', '3'),
                    arrayOf('4', '2', '6', '8', '5', '-', '7', '9', '1'),
                    arrayOf('-', '1', '3', '9', '2', '4', '8', '5', '6'),
                    arrayOf('9', '6', '1', '-', '3', '7', '2', '8', '4'),
                    arrayOf('2', '8', '7', '4', '1', '9', '-', '3', '5'),
                    arrayOf('3', '4', '-', '2', '8', '6', '1', '7', '9')
                ))
            )
            check(
                name = "when invalid row there is repetition ",
                correctRes = false,
                res = sudokuCheckValidation(arrayOf(
                    arrayOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
                    arrayOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
                    arrayOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
                    arrayOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
                    arrayOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
                    arrayOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
                    arrayOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
                    arrayOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
                    arrayOf('3', '4', '5', '2', '8', '6', '1', '7', '7')//7
                ))
            )
            check(
                name = "when invalid column there is repetition ",
                correctRes = false,
                res = sudokuCheckValidation(arrayOf(
                    arrayOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
                    arrayOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
                    arrayOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
                    arrayOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
                    arrayOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
                    arrayOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
                    arrayOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
                    arrayOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
                    arrayOf('5', '4', '5', '2', '8', '6', '1', '7', '9')//5
                ))
            )
            check(
                name = "when invalid box 3*3 there is repetition ",
                correctRes = false,
                res = sudokuCheckValidation(arrayOf(
                    arrayOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
                    arrayOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
                    arrayOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
                    arrayOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
                    arrayOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
                    arrayOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
                    arrayOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
                    arrayOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
                    arrayOf('3', '4', '5', '2', '8', '6', '1', '1', '9')//1
                ))
            )
            check(
                name = "when invalid size of row  ",
                correctRes = false,
                res = sudokuCheckValidation(arrayOf(
                    arrayOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
                    arrayOf('6', '7', '2', '1', '9', '5', '3', '4'),//
                    arrayOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
                    arrayOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
                    arrayOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
                    arrayOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
                    arrayOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
                    arrayOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
                    arrayOf('3', '4', '5', '2', '8', '6', '1', '7', '9')
                ))
            )
            check(
                name = "when invalid size column ",
                correctRes = false,
                res = sudokuCheckValidation(arrayOf(
                    arrayOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
                    arrayOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
                    arrayOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
                    arrayOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
                    arrayOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
                    arrayOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
                    arrayOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
                    arrayOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
                ))
            )
            check(
                name = "when invalid input not 1..9 or - ",
                correctRes = false,
                res = sudokuCheckValidation(arrayOf(
                    arrayOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
                    arrayOf('6', '7', '2', '1', '9', '5', '3', '4', 'p'),//p
                    arrayOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
                    arrayOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
                    arrayOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
                    arrayOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
                    arrayOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
                    arrayOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
                    arrayOf('3', '4', '5', '2', '8', '6', '1', '7', '9')
                ))
            )
        }
        private fun check(name: String,correctRes:Boolean,res:Boolean){

            if(res==correctRes) println("success test $name")
            else println("failed test $name")
        }
    }
}

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



/*
checkRowColumnSubgrid({- , - , - , - , - , - , - , - , -})--> true
checkRowColumnSubgrid({- , 4 , 3 , - , 6 , - , - , - , -})--> true
checkRowColumnSubgrid({1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9})--> true
checkRowColumnSubgrid({1 , - , 6 , - , 4 , 1 , - , 2 , -})--> false
checkRowColumnSubgrid({1 , - , 6 , - , 4 , 1 , - , 1 , -})--> false
   */