//when without expression
//it is not mandatory to use when as an expression
//it can be used normally also as in other language
fun main(args:Array<String>)
{
  var number = 4
  when(number)
  {
      1 -> println("one")
      2 -> println("two")
      3 -> println("three")
      4 -> println("four")
      5 -> println("five")
      else -> println("invalid number")
  }
}