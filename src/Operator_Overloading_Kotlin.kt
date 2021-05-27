//operator overloading in kotlin
//this increases the complexity of our project
//if you want to use operator overloading, then we have to use the operator keyword
fun main(args : Array<String>)
{
    var a1 = Alien_2()
    //this creates an object and in kotlin we don't need to use new keyword
    a1.skills = "JAVA"
    a1.show()

    var a2 =Alien_2()
    a2.skills = "SQL"
    a2.show()

    var a3 = a1 + a2
    a3.show()
}
operator infix fun Alien_2.plus(a : Alien_2) : Alien_2
{
    var newAlien_2 = Alien_2()
    newAlien_2.skills = this.skills + " "+ a.skills
    return newAlien_2
}
//infix function can take only one parameter
//in c++ we had operator overloading, but in JAVA there was no operator overloading feature
//in kotlin, we have the operator overloading feature
//if we want to use operator overloading, we have to use operator as a keyword
//if we want to use infix function, then we have to use infix as a keyword