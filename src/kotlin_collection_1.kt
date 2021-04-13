//collection //in kotlin are used to store a group of related objects in a single unit
//List Interface
//List Interface inherits from collection class
//its immutable
//its method support only read only functionality
//function of List Interface
//listOf()
//listOf<E>()
//the elements of list follow the sequence of insertion order
//and contains the index number same as array
fun main(args:Array<String>)
{
    var list = listOf("ankita","nicky","abhilash","vicky")
    //read-only
    //fixed size
    for(element in list)
    {
        println(element)
    }
}
