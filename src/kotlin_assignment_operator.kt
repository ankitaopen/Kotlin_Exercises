//assignment operator
//this assignment operator takes values from right to left
fun main(args:Array<String>)
{
    var a:Int=20
    var b:Int=5
    //var variable
    //mutable variable
    //the value of var variable can be changed
    a+=b
    //a=a+b
    println("a+=b:"+a)
    a-=b
    //a=a-b
    println("a-=b:"+a)
    a*=b
    //a=a*b
    println("a*=b:"+a)
    a/=b
    //a=a/b
    println("a/=b:"+a)
    a%=b
    //a=a%b
    println("a%=b:"+a)
}