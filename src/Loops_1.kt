//for loop is used when we know the range of values
//while loop is used when we don't know the range of values
//in kotlin while loop and do while loop remains the same but kotlin has made changes for the for loop
fun main(args : Array<String>)
{
    var numbers : IntRange = 1 .. 5
    //for loop of kotlin
    for(number in numbers)
    {
        //here we dont need to specify the type of number
        //it by default takes the type of numbers
        println(number)
    }

}