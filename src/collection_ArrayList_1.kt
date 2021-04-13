//kotlin ArrayList class
//kotlin ArrayList class can be used to create dynamic array
//this means the size of the ArrayList can be increased or decreased according to requirement
//ArrayList class provides both read and write functionalities
//kotlin ArrayList follows the sequence of insertion order
//ArrayList class is non-synchronized and it may contain duplicate elements
//the elements of ArrayList class are accessed randomly as it works on index basis
//constructor of kotlin ArrayList class
//ArrayList<E>()
//it is used to create an empty ArrayList
//ArrayList(capacity:Int)
//it is used to create an ArrayList with specified capacity
//ArrayList(elements:Collection<E>)
//it is used to create an ArrayList filled form the elements of collection
//program to create an empty ArrayList and adding objects to it
fun main(args:Array<String>)
{
    var arrayList_1 = ArrayList<String>()
    //creating an empty ArrayList
    arrayList_1.add("openbank")
    arrayList_1.add("ankita")
    arrayList_1.add("sahoo")
    arrayList_1.add("open")
    arrayList_1.add("finanacial")
    arrayList_1.add("technologies")
    //adding elements in ArrayList
    println("the ArrayList is:")
    for(elements in arrayList_1)
    {
        println(elements)
    }
}