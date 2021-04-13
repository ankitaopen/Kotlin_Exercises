//kotlin ArrayList
//arrayListOf()
//arrayListOf() is a function of ArrayList class
//ArrayList is mutable which means it provides both read and write functionalities
fun main(args: Array<String>)
{
    var arrayList = arrayListOf<Int>(100,200,300,400)
    for(element in arrayList)
    {
        println(element)
    }
    println(arrayList)
}
