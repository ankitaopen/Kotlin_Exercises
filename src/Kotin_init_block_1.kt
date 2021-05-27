//the init block is executed in kotlin immediately after the object creation
fun main(args : Array<String>)
{
    var student = Student_1("ankita")
    //object creation
    //student.name = "ankita"

}
//class Student_1 constructor(name : String)
class Student_1(name : String)
//this is primary constructor in kotlin
//here the name String is just acting as a parameter,
{
    //var name : String = "dummy"
    init
    {
        //this init block will be executed as soon as the object is created in the main block
        println("the name of the student is: $name")
    }


}