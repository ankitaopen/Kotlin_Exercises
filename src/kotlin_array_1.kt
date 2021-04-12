//Array in kotlin are mutable in nature with fixed size
//this we can perform both read and write operation on elements of array
//array declaration
//var myArray = Array<Int>(5){0}
//it initializes the elements of array of type int with size 5 with all elements as 0 (zero)
//array declaration using arrayOf function
//var myArray1 = arrayOf(10,20,30,40,50)
//var myArray2 = arrayOf<Int>(10,20,30,40,50)
//val myArray3 = arrayOf<String>("ankita","nicky","karthik")
//val myArray4 = arrayOf(10,20,30,"ankita","karthik")
//-------------
//kotlin array declaration - using intArrayOf function
//var myArray5: IntArray = intArrayOf(5,10,15,20,25)
fun main(args:Array<String>)
{
    var myArray1 = Array<Int>(5){1000}
    for(element in myArray1)
    {
        println(element)
    }
}