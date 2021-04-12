//named argument
fun main(args:Array<String>)
{
    run_3(letter='K')
}
fun run_3(number :Int=100,letter :Char='A')
{
    println("parameters in function definition are $number and $letter")
}