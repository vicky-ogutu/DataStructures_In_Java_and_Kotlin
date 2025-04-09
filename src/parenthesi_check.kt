fun isMatch(paranthesis:String):Boolean{
    var stack =ArrayDeque<Char>()
    var pair = mapOf(')' to '(', '}' to '{', ']' to '[' )

    for (x in paranthesis){
        if (x in "({["){
            stack.addLast(x)
        }else if (stack.isEmpty() || stack.removeLast() != pair[x]){
            return false
        }



    }
    return stack.isEmpty()
}

fun main(){

    println(isMatch("({[]})"))
    println(isMatch("({])"))
}
