//multiple branches of when
//we can use multiple branches of condition separated with a comma
//it is used when we need to run a same logic for multiple choices
fun main(args: Array<String>)
{
    var number = 8
    when(number)
    {
        3,4,5,6 -> println("it is summer season")
        7,8,9 -> println("it is rainy season")
        10,11 -> println("it is autumn season")
        12,1,2 -> println("it is winter season")
        else -> println("invalid input")
    }
}