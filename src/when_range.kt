//using when in the range
//the when expression also checks the range of input provided in when condition
//the range is created using double dot operator ..
//the in operator is used to check if a value belongs to a range
fun main(args:Array<String>)
{
    var number = 7
    when(number)
    {
        in 1..5 -> println("the input is provided in the range 1 to 5")
        in 6..10 -> println("the input is provided in the range 6 to 10")
        else -> println("none of the above")
    }
}