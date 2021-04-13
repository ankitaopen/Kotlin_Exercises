//remove()
//it is used to remove single instance of specific element form the current collection
//removeAt()
//it is used to remove the specific index element from the list
//removeRange()
//it removes the elements from the starting index to the end index in which the end index is not included
//indexOf()
//it returns the first occurrence of the specified element in the list or returns -1 if the element is not present in the list
//lastIndexOf()
//it is used to return the last occurrence of the given element in the list or returns -1 if the element is not present in the list
fun main(args: Array<String>)
{
    var arrayList: ArrayList<String> = ArrayList<String>(20)
    //creating an arrayList of initial size 10
    arrayList.add("openbank")
    arrayList.add("ankita")
    arrayList.add("sahoo")
    arrayList.add("open")
    arrayList.add("financial")
    arrayList.add("technologies")
    arrayList.add("ankita")
    arrayList.add("sahoo")
    arrayList.add("open")
    arrayList.add("ankita")
    arrayList.add("sahoo")
    arrayList.add("open")

    println("the arrayList is:" +arrayList)
    //traversal of the arrayList using iterator() function
    val itr = arrayList.iterator()
    while(itr.hasNext())
    {
        println(itr.next())
    }
    println("the index of ankita is:" +arrayList.indexOf("ankita"))
    //returns the index of first occurrence of specified element in the list
    //1
    println("the index of nicky is:" +arrayList.indexOf("nicky"))
    //-1
    //returns -1 as the given element is not present in the list
    println("the index of technologies is:" +arrayList.indexOf("technologies"))
    //5
    //lastIndexOf()
    //returns the last occurrence of given element from the list
    //or returns -1 if the element is not present in the list
    println("the last occurrence of open is:" +arrayList.lastIndexOf("open"))
    //11
    println("the last occurrence of ankita is:" +arrayList.lastIndexOf("ankita"))
    //9
    println("the last index of sahoo is:" +arrayList.lastIndexOf("sahoo"))
    //10
    println("the last occurrence of nicky is:" +arrayList.lastIndexOf("nicky"))
    //-1
    //remove()
    println("remove()")
    arrayList.remove("ankita")
    println(arrayList)
    //removes single instance of specific element

    //removeAt()
    println("removeAt()")
    arrayList.removeAt(10)
    arrayList.removeAt(1)
    println(arrayList)

    //removeRange
    println("removeRange()")
    //arrayList.removeRange(1,7)
    //println(arrayList)



}