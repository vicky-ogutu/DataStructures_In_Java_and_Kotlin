fun main(){

    val stack1= ArrayDeque<Int>()

    //push
    stack1.addLast(10)
    stack1.addLast(20)
    stack1.addLast(30)

    println(stack1)
    //peek
   println(stack1.last())
    //pop
    println(stack1.removeLast())
    println(stack1)


}