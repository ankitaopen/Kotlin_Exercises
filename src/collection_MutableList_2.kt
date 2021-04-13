//the function mutableListOf() of MutableList interface provides facilities to add elements after its declaration
//MutableList can also be declared empty and added elements later
//but in this situation we need to define its generic type
fun main(args:Array<String>)
{
    //non-empty MutableList
    var mutableList_1 = mutableListOf("ankita","nicky")
    mutableList_1.add("open")
    mutableList_1.add("financial")
    mutableList_1.add("technologies")
    println("traversal of elements in mutableList_1")
    for(element in mutableList_1)
    {
        println(element)
    }
    //empty MutableList
    var mutableList_2 = mutableListOf<String>()
    mutableList_2.add("mango")
    mutableList_2.add("apple")
    mutableList_2.add("orange")
    mutableList_2.add("kiwi")
    mutableList_2.add("dragon fruit")
    println("traversal of elements on mutableList_2 index wise")
    for(index in 0..mutableList_2.size)
    {
        println(mutableList_2[index])
    }
}