//recursion in kotlin
//recursion is basically a function calling itself
//here we are calling show() and then show() calls itself
//it goes into infinite loop
//stack overflow
fun main(args : Array<String>)
{
    show()
}
fun show()
{
    println("hello")
    show()
    //recursive call
}
//here this recursive call leads to stack overflow
