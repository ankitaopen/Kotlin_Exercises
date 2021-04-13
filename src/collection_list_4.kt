//use of different function of kotlin list interface using listOf<T>() function
fun main(args: Array<String>)
{
    var stringList: List<String> = listOf<String>("ankita","nicky","abhilash","vicky","karthik")
    var list: List<String> = listOf<String>("apple","orange","mango")
    for(element in stringList)
    {
        println(element)
    }
    println("----------------")
    for(element in list)
    {
        println(element)
    }
    println("----------------")
    println(stringList.get(0))
    println(list.get(2))
    println(stringList.indexOf("karthik"))
    println(list.indexOf("orange"))
    println(stringList.lastIndexOf("ankita"))
    //returns the last occurance of the specified element in the list
    println(list.lastIndexOf("mango"))
    println(stringList.size)
    println(list.size)
    println(stringList.contains("abhilash"))
    println(list.contains("papaya"))
    println(stringList.containsAll(list))
    println(stringList.subList(2,4))
    println(list.subList(0,1))
    println(stringList.isEmpty())
    println(list.isEmpty())
    println(stringList.drop(2))
    println(list.drop(1))

}