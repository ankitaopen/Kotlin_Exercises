//multiple statement of when using braces
//we can use multiple statements enclosed within the block of condition
fun main(args: Array<String>)
{
    var number = 1
    when(number)
    {
        1 ->
        {
            println("monday")
            println("first day of the week")
        }
        2 -> println("tuesday")
        3 -> println("wednesday")
        4 -> println("thursday")
        5 -> println("friday")
        6 -> println("saturday")
        7 -> println("sunday")
        else -> println("other invalid days")
    }
}