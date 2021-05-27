//in kotlin when can be used as an expression
//expression means it can evaluate something and returns a value
fun main(args : Array<String>)
{
    val number : Int = 4
    val str = when(number)
    {
        1 -> "ONE"
        2 -> "TWO"
        3 -> "THREE"
        4 -> "FOUR"
        5 -> "FIVE"
        else -> "ENTER PROPER INPUT"
    }
    //println(str)
    println("str is : $str")
}