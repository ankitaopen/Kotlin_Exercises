//we can also rewrite the value of the array using its index value
//as we are able to modify the value of the array its called mutable in nature
fun main(args:Array<String>)
{
    var myArray = arrayOf<Int>(10,20,30,40,50)
    for(element in myArray)
    {
        println(element)
    }
    //as array is mutable
    println("mutable property of array")
    myArray[1]=100
    myArray[3]=300
    for(element in myArray)
    {
        println(element)
    }

}