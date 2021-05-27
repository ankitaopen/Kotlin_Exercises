//if else in kotlin
//in kotlin if else is not just a statement
//rather its an expression
//it can be evaluated and the value can be assigned to a variable

fun main(Args : Array<String>)
{
    val num1 = 10
    val num2 = 20
    //val-----immutable variables
    //num1 and num2 are declared as val as their value is not reassigned in further course of the program
    var result = 0
    //var-----mutable variables
    //result is declared as var as its value is re-assigned in due course of the program
    result = if(num1 > num2)
        //using if else as expression in kotlin
        num1
    else
        num2
    println("the greater number between $num1 and $num2 is : $result")
}
//using if else as an expression in kotlin