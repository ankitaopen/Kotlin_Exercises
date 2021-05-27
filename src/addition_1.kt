import java.util.*

//adding two number where user gives the input
//if we want to take input form keyword for any datatype other than String, then we have to create object of Scanner
fun main(args : Array<String>)
{
    //create an instance which take input form standard input (keyword)
    //taking the first number as input from keyword
    val readerOne = Scanner(System.`in`)
    println("enter numberOne")
    //nextInt() reads the next integer from keyword
    val numberOne : Int = readerOne.nextInt()
    println("THE FIRST NUMBER ENTERED IS: $numberOne")

    val readerTwo = Scanner(System.`in`)
    println("enter numberTwo")
    val numberTwo : Int = readerTwo.nextInt()
    println("THE SECOND NUMBER ENTERED IS: $numberTwo")

    var sum : Int
    //var -------- mutable variable
    sum = numberOne + numberTwo

    println("THE SUM OF TWO NUMBERS IS: $sum")


}