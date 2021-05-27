fun main(args : Array<String>)
{
    var student = Student()
    //object creation of student class
    student.name = "ankita"
    //here kotlin will internally call the setName() method
    println("the name of the student is : ${student.name}")
}
class Student
{
    //body of the class
    var name : String = "dummy name"
    //if we want to print the student name here in the class body then we have to use init block

}