//non local control flow
//in inline function we can return form the lambda expression itself
//this will lead to exit from the function in which the inline function was called
fun main(args: Array<String>)
{
    inlineFunction({println("calling inline functions")
    return},
            {println("next parameters in inline functions")})
}
inline fun inlineFunction(myFun: () -> Unit, nextFun: () -> Unit)
{
    myFun()
    nextFun()
    println("code inside inline function")
}