//if else expression
fun main(args:Array<String>)
{
    val number_1=100
    val number_2=200
    val result = if(number_1>number_2)
    {
        "$number_1 is greater than $number_2"
    }
    else
    {
        "$number_1 is less than $number_2"
    }
    println(result)

}