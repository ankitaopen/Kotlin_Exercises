//creating an ArrayList with a specified capacity
//the capacity of ArrayList is not fixed and it can be changed later in the program depending on requirement
fun main(args:Array<String>)
{
    var arrayList_1 = ArrayList<Int>(10)
    //creating an ArrayList whose initial capacity is 10
    println("the size if arrayList_1 is:" +arrayList_1.size)
    arrayList_1.add(100)
    arrayList_1.add(0,200)
    arrayList_1.add(1,300)
    arrayList_1.add(2,400)
    arrayList_1.add(3,500)
    arrayList_1.add(600)
    println("the size of arrayList_1 is:" +arrayList_1.size)
    println("the arrayList_1 is:")
    for(elements in arrayList_1)
    {
        println(elements)
    }
    var arrayList_2 = ArrayList<String>(5)
    //creating an ArrayList of type String having size 5
    arrayList_2.add(0,"bankopen")
    arrayList_2.add("ankita")
    arrayList_2.add("sahoo")
    arrayList_2.add(1,"open")
    arrayList_2.add(2,"financial")
    arrayList_2.add(3,"technologies")
    println("the size of arrayList_2 is:" +arrayList_2.size)
    for(elements in arrayList_2)
    {
        println(elements)
    }

}