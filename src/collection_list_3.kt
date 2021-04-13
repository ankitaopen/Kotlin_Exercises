//for being more specific we can provide the generic types of list such as
//listOf<Int>()
//listOf<String>()
//listOf<Any>()
fun main(args: Array<String>)
{
    var intList: List<Int> = listOf<Int>(10,20,30)
    var stringList: List<String> = listOf<String>("ankita","nicky","karthik")
    var anyList: List<Any> = listOf<Any>(10,20,30,"ankita","nicky","karthik")
    println("PRINT THE INTEGER LIST")
    for(element in intList)
    {
        println(element)
    }
    println("PRINT THE STRING LIST")
    for(element in stringList)
    {
        println(element)
    }
    println("PRINT THE ANY LIST")
    for(element in anyList)
    {
        println(element)
    }
    

}