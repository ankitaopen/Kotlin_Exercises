import java.util.*

//if else statement in kotlin
//in kotlin if else is not just a branching statement rather its an expression

fun main(args : Array<String>)
{
    //taking input for the first number
    val reader1 = Scanner(System.`in`)
    println("enter the first number")
    val num1 : Int = reader1.nextInt()
    println("the number entered by user is : $num1")

    //taking input for the second number
    val reader2 = Scanner(System.`in`)
    println("enter the second number")
    val num2 : Int = reader2.nextInt()
    println("the number entered by user is : $num2")

    val result : Int = 0
    //here we are giving the default value as 0
    //as its a local variable so we have to initialize it else it gives error

    if(num1 > num2)
        println("the greater number is $num1")
    else
        println("the greater number is $num2")

}