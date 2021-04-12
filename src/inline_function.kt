//inline function
//an inline function is declared with a keyword inline
//the use of inline function enhances the performance of higher order function
//the inline function tells the compiler to copy the parameters and function to the call site
//the virtual function or local function cannot be declared as inline
//following are the expression and declaration which are not supported anywhere inside inline function
//declaration of local classes
//declaration of inner nested classes
//function expression
//declaration of local function
//default value of optional parameters
fun main(args:Array<String>)
{
    inlineFunction({println("calling inline functions")})
}
inline fun inlineFunction(myFun: () -> Unit)
{
    myFun()
    print("code inside inline function")
}