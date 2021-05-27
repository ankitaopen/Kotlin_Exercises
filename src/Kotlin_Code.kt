//from a kotlin file we can create an object of java class
fun main(args : Array<String>)
{
//here we will create an object of JavaKotlinCall class
    var ankitaObject  = JavaKotlinCall()
    //here we are creating an object of java class inside a kotlin file
    ankitaObject.name = "ankita"
    //here by default getName() method will be called in the background by kotlin
    println(ankitaObject.name)



}
//everything at the end gets converted to byte code and that's what runs on JVM
//for every kotlin file also .class file is generated