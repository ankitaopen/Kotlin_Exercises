//visibility modifiers in kotlin
//1-public
//2-protected
//3-internal
//4-private
class TestClass
{
    fun testing()
    {
        //person.a------not visible-----since a is private in nature
        //person.b------not visible-----since b is protected in nature
        //person.c------visible---------since c is internal in nature
        //person.d------visible---------since d is public in nature
        var person = Person()
        //this creates an object of class person
        //println(person.b)
        //as b is protected it is visible only within the subclass
        //protected keyword will not make your value visible in some other class that has nothing to to with it
        println(person.c)
        //c is internal variable so its accessible
        println(person.d)
        //d is public variable so its accessible

    }
}
open class Person
//super class
//open keyword-----class name
//in kotlin all classes are final by default and they cannot be inherited by default
//so to make a kotlin class inheritable we have to mark it with open keyword
//otherwise we will get an error saying "type is final and cannot be inherited"
{
    private val a = 10
    //visible only within the class
    protected val b = 20
    //visible within the subclass
    //the protected keyword makes the value visible only within the subclass
    internal val c = 30
    //visible within the module
    val d = 40
    //by default public
    //by default all the classes,functions and properties are by default public in nature
}
class Indian : Person()
//derived class or sub-class
{
    //a is not visible here
    //b,c,d is visible here
    fun testPrint()
    {
        println("the value of the protected variable b is $b")
        println("the value of the internal variable c is $c")
        println("the value of the public varibale d is $d ")
    }
}
//open keyword------ with function
//just like classes in kotlin all functions are by default final in nature
//that is we cannot override a function when the function is final in nature
//function overriding
//function overriding is a process of re-defining the functions of base class in the child class
//also in the child class we have to use the override modifier
//open keyword ------- with variables
//just like classes and functions the variables in kotlin are by-default final in nature
//so to override it in child class we need to set the variable as open in base class
fun main(args : Array<String>)
{
    //testPrint()
}

