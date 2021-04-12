//lambda function
//lambda is a function which has no name
//lambda is defined with a curly braces which takes variable as a parameter (if any) and body of a function
//the ody of a function is written after variable (if any) followed by -> operator
//syntax of lambda
// {variable -> body_of_function}
//add
fun main(args:Array<String>)
{
    //lambda function
    val myLambda: (Int) -> Unit = {s:Int -> println(s)}
    addNumber_1(100,200,myLambda)
}
fun addNumber_1(number_1:Int,number_2:Int,myLambda: (Int) -> Unit)
{
    val add = number_1 + number_2
    myLambda(add)
    //println(add)
}