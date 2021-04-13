//for more specific we can define generic types of arrayListOf() function
//arrayListOf<Int>()
//arrayListOf<String>()
//arrayListOf<Any>()
fun main(args: Array<String>)
{
    var intArrayList: ArrayList<Int> = arrayListOf<Int>(100,200,300)
    var stringArrayList: ArrayList<String> = arrayListOf<String>("ankita","sahoo","openbank")
    var anyArrayList: ArrayList<Any> = arrayListOf<Any>("ankita",100,"sahoo",200,"openbank",300)
    //var
    //mutable variable
    //the values of this variable can be changed in later stage of the program
    println("print int ArrayList")
    println(intArrayList)
    //traversal of ArrayList
    for(element in intArrayList)
    {
        println(element)
    }
}