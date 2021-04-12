//the elements of an array are iterated on the basis of indices(index of the array)
fun main(args: Array<String>)
{
    val marks = arrayOf(10,20,30,40,50,60,70,80,90,100)
    for(item in marks.indices)
        println("marks[$item]:"+marks[item])
}