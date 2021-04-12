//when expression
//when expression is a conditional expression which returns the value
//kotlin when expression is the replacement of the switch statement
fun main(args:Array<String>)
{
    var number = 4
    var number_provided = when(number)
    //here we are using when as an expression
    {
        1 -> "one"
        2 -> "two"
        3 -> "three"
        4 -> "four"
        5 -> "five"
        else -> "invalid number"
    }
    println("you provided $number_provided")
}