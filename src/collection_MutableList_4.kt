//use of different functions of MutableList interface using mutableListOf<T>() function
fun main(args: Array<String>)
{
    var mutableList_1 = mutableListOf<String>()
    var mutableList_2 = mutableListOf<String>()
    var mutableList_3 = mutableListOf<String>()
    var mutableList_4 = mutableListOf<String>()

    mutableList_1.add("ankita")
    //adding the given element to the collection
    mutableList_1.add("sahoo")
    mutableList_1.add("open")
    mutableList_1.add("financial")
    mutableList_1.add("technologies")
    mutableList_1.add(0,"bankopen")
    //adding an element at a perticular index
    println("mutableList_1 is:")
    for(element in mutableList_1)
    {
        println(element)
    }
    mutableList_2.addAll(mutableList_1)
    //mutableList_1 is copied to mutableList_2
    println("mutableList_2 is:")
    //println("mutableList_2")
    for(element in mutableList_2)
    {
        println(element)
    }
    println("---------------------------")
    mutableList_2.remove("technologies")
    //removes the specified element if present in current location
    mutableList_2.removeAt(0)
    //removes the element present at 0th index
    for(element in mutableList_2)
    {
        println(element)
    }
    println("----------------------------")
    mutableList_2.removeAll(mutableList_2)
    println("----------------------------")
    //adding element to mutableList_3
    mutableList_3.add(0,"apple")
    mutableList_3.add(1,"orange")
    mutableList_3.add(2,"grapes")
    mutableList_3.add(3,"mango")
    mutableList_3.add("kiwi")
    println("mutableList_3 is:")
    for(elements in mutableList_3)
    {
        println(elements)
    }
    mutableList_3.set(0,"dragon fruit")
    //replaces the element at index 0 with dragon fruit
    println("-----------------------------")
    println("mutableList_3 is changes to:")
    for(elements in mutableList_3)
    {
        println(elements)
    }
    mutableList_3.subList(1,3)
    println("------------------------------")
//    for(elements in mutableList_3)
//    {
//        println("elements")
//    }
    //printing the sublist
    println(mutableList_3.subList(1,3))
    //it returns the list from specified from_index (INCLUSIVE) to to_index(EXCLUSIVE) from the current list
}