//in listOf() function we can pass different types of data at the same time
//List can also traverse the list using range
fun main(args:Array<String>)
{
    var list = listOf(1,2,3,"ankita","nicky","karthik")
    //passing different types of data at the same time
    //read-only
    //fixed size
    for(element in list)
    {
        println(element)
    }
    println("-------------")
    for(index in 0..list.size-1)
    {
        println(list[index])
        //println(index)
    }
}
