//relational operator
fun main()
{
    val a=100
    val b=200
    //val variable
    //mutable variable
    //the value of the variable a and b can be changed in later stage of the program
    val max = if(a>b)
    {
        println("a is greater than b")
        a
    }
    else
    {
        println("a is less than b")
        b
    }
    //println("max="+max)
    println("max=$max")

}