//kotlin default argument
//passing some argument to function call
fun main(args:Array<String>)
{
    run_1(10)
    //passing some argument to function call
}
 fun run_1(num:Int=100,letter:Char='K')
{
    println("parameters in the function definition are $num and $letter")
}
