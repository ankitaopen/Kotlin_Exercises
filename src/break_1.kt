//break expression
//the break expression is used to terminate the nearest enclosing loop
fun main(args: Array<String>)
{
    for(i in 1..10)
    {
        if(i==5)
        {
            break
            //this break expression is used to terminate the nearest enclosing loop
        }
        println(i)
    }
}