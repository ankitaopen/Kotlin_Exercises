//kotlin default argument
fun main(args: Array<String>) {
    run()
}
fun run(num:Int= 5, letter: Char ='x'){
    print("parameter in function definition $num and $letter")
}
//here the run() function is called with no argument, the default parameters are used in function definition