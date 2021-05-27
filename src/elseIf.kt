//else if in kotlin
fun main(args : Array<String>)
{
    val number1 = 10
    val number2 = 20

    var result = 0
    //here we are initializing result to 0
    //this is because as its a local variable it has to be initialized
    //else it gives error

    result = if(number1 > number2)
        number1
    else if(number1 < number2)
        number2
    else
        0
    println(result)
}