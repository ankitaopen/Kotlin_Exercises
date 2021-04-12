//default argument
//passing all arguments in function call
//as all the arguments are passed in function call, the parameters of function definition uses the arguments passed in function call
fun main(args:Array<String>)
{
    run_2(10,'K')
}
fun run_2(number:Int=100,letter:Char='A')
{
    println("the parameters in the function definition are $number and $letter")
}
