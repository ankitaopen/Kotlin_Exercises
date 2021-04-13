//get()
//the get() function of ArrayList class is used to retrieve the element present at a specified index
fun main(args: Array<String>)
{
    var arrayList = ArrayList<Int>(10)
    arrayList.add(100)
    //add() is used to insert the specific element into the collection
    arrayList.add(200)
    arrayList.add(2,300)
    //this is used to insert an element at specific index
    arrayList.add(100)
    arrayList.add(200)
    arrayList.add(400)
    arrayList.add(500)
    //traversal of ArrayList using iterator() function
    //duplicates are allowed in ArrayList
    println("the arraylist is:" +arrayList)
    val itr = arrayList.iterator()
    while(itr.hasNext())
    {
        println(itr.next())
    }
    arrayList.get(0)
    //get() function is used to return the element at specified index
    println("the element present at 0th index is:" +arrayList.get(0))
    //set()
    //it is used to replace the element from the specified position from current list with the specified element
    arrayList.set(0,1000)
    arrayList.set(1,2000)
    println("the arraylist is changed to:" +arrayList)

}