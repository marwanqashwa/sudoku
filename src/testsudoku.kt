fun checksSudoku() {

    check(
        name = " when invalid sudoku empty should return false",
        correctRes = false,
        res = sudokuCheckValidation(arrayOf())
    )
    check(
        name = "when valid sudoku all complete should return true",
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
        name = "when valid sudoku not complete should return true",
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
        name = "when invalid row there is repetition should return false ",
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
        name = "when invalid column there is repetition should return false",
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
        name = "when invalid box 3*3 there is repetition should return false",
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
        name = "when invalid size of column should return false",
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
        name = "when invalid size row should return false",
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
            ///////////////////////////////////////////////////
        ))
    )
    check(
        name = "when invalid input not 1..9 or -  should return false",
        correctRes = false,
        res = sudokuCheckValidation(arrayOf(
            arrayOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
            arrayOf('6', '7', '2', '1', '9', '5', '3', '4', '0'),//p
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