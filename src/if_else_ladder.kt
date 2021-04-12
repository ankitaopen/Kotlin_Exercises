//if_else_ladder
fun main(args:Array<String>)
{
    val number=110
    val result=if(number>0)
        "$number is positive"
    else if(number < 0)
        "$number is negative"
    else
        "$number is zero"
    println(result)
}