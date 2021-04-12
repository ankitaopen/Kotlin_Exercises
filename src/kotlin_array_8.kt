//traversing using range
//in kotlin array elements are also traversed using index range(minValue...maxValue) or (maxvalue...minValue)
fun main(args:Array<String>)
{
    var myArray:IntArray = intArrayOf(5,10,15,20,25)
    for(index in 0..4)
    {
        println(myArray[index])
    }
    println()
    for(index in 0..myArray.size-1)
    {
        println(myArray[index])
    }
}