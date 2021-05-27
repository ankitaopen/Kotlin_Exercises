//kotlin for loop
//here the step is 1 by default
fun main(args : Array<String>)
{
    val numbers : IntRange =1..20
    for(number in numbers step 2)
    {
        println(number)
    }
}