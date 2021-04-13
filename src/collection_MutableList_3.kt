//for being more specific we can provide generic types of MutableList interface
//mutableListOf<Int>()
//takes only integer values
//mutablelistOf<String>()
//takes only string values
//mutableListOf<Any>()
//takes any values of all data types
fun main(args:Array<String>)
{
    var mutableListInt: MutableList<Int> = mutableListOf<Int>()
    //this creates an empty mutableList of integer
    var mutableListString: MutableList<String> = mutableListOf<String>()
    //this creates an empty mutableList of string
    var mutableListAny: MutableList<Any> = mutableListOf<Any>()
    //this creates an empty mutableList of any datatype
    mutableListInt.add(100)
    mutableListInt.add(200)
    mutableListInt.add(300)
    mutableListInt.add(400)
    mutableListInt.add(2,500)
    //adding elememt 500 at index 2
    println("print Int type MutableList")
    for(element in mutableListInt)
    {
        println(element)
    }
    mutableListString.add("ankita")
    mutableListString.add("sahoo")
    mutableListString.add("open")
    mutableListString.add("financial")
    mutableListString.add("technologies")
    mutableListString.add(2,"bankopen")
    //adding bankopen at index 2
    println("print String type MutableList")
    for(element in mutableListString)
    {
        println(element)
    }
    mutableListAny.add(0,100)
    //adding 100 at 0th index
    mutableListAny.add(200)
    mutableListAny.add("karthik")
    mutableListAny.add(300)
    mutableListAny.add("sala")
    println("print any type MutableList")
    for(element in mutableListAny)
    {
        println(element)
    }
}