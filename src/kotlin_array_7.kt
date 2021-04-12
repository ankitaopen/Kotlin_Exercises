//when we try to insert an element an an index position greater than array size then it will throw ArrayIndexOutOfBoundException
fun main(args: Array<String>)
{
   var myArray: IntArray = intArrayOf(10,20,30,40,50)
    for(element in myArray)
    {
        println(element)
        myArray[7] = 900
        //ArrayIndexOutOfBoundException
        for(element in myArray)
        {
            println(element)
        }
    }
}