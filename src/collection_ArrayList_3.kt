//the elements in kotlin ArrayList can also be added using other Collections
//elements of Arraylist can also be traversed using iterator() function
fun main(args: Array<String>)
{
    var arrayList: ArrayList<String> = ArrayList<String>(5)
    //creating an ArrayList of initial capacity 5
    var list: MutableList<String> = mutableListOf<String>()

    //adding elements to the mutableList
    list.add("open")
    list.add("financial")
    list.add("technologies")

    arrayList.addAll(list)
    //all the elements of list gets added to the arrayList
    println("the arrayList is:")
    //printing the arrayList using iterator() function
    val itr = arrayList.iterator()
    while(itr.hasNext())
    {
        println(itr.next())
    }
    println("the size of arrayList is:" +arrayList.size)

}