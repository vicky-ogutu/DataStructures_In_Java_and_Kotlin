fun reverseString(name:String):String{

    val stack =ArrayDeque<Char>()

    for(x in name){
        stack.addLast(x)
    }

  return buildReversed(stack)

}

fun buildReversed(stack2:ArrayDeque<Char>):String{

    if (stack2.isEmpty())
        return "Empty stack"

    val top =stack2.removeLast()
    return top + buildReversed(stack2)
}

fun main(){
    val result = reverseString("Ogutu");
    println(result)
}