import java.util.*

//addition in kotlin
//taking standard input from keyword
//String template
fun main(args : Array<String>)
{
    //taking input from standard input device i.e key bord
    val reader1 = Scanner(System.`in`)
    println("enter the first number")
    val number1 : Int = reader1.nextInt()
    println("the first number entered by the user is $number1")

    //taking input for the second number
    val reader2 = Scanner(System.`in`)
    println("enter the second number")
    val number2 : Int = reader2.nextInt()
    println("the second number entered by the user is $number2")

    val sum = number1 + number2
    println("the sum of $number1 and $number2 is $sum")
    //println(sum)
    //val
    //value
    //immutable
    //val variable cannot be re-assigned or they cannot change its value in due course of the program
    //in this code all the variables are declared as val as they are never being re-assigned

    //creating object of Alien() class
    var object1 = Alien()
    object1.name = "ankita"
    //here kotlin will call getName() method by default
    println("the name of object1 is : ${object1.name}")
    //we can use curly braces {} when it comes to object printing
}
//when we try to print any object its hash code gets printed
//when we want to print any normal variable we can directly go with the $ symbol
//but when we want to print any object in which we have some properties to mention both together we have to use ${}