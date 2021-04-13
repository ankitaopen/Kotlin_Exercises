//MutableList
//mutableListOf()
//kotlin MutableList is an interface and generic collection of elements
//MutableList interface is mutable in nature
//it inherits from Collection<T> class
//the methods of MutableList interface supports both read and write functionalities
//once the elements in MutableList have been declared, we add more elements into it and can remove elements from it
//so MutableList has no fixed size
//functions in MutableList interface
//mutableListOf()
//mutableListOf<E>()
//the elements of MutableList follow the sequence of insertion order and contains index number same as array
//example of MutableList using mutableListOf() function and traverse its elements
fun main(args:Array<String>)
{
    var mutableList = mutableListOf("ankita","nicky","abhilash","vicky","karthik")
    //traversal of list
    for (element in mutableList)
    {
        println(element)
    }
    //traversal of list with index
    println("traversal of mutable list with index")
    for(index in 0..mutableList.size-1)
    {
        println(mutableList[index])
    }
}