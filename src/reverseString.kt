fun main(){

   var result= reverse_name("vicky")
    println(result)
}

fun reverse_name(name:String):String{
    var stack = ArrayDeque<Char>()

    // push characters of the string to stack
    for(x in name){
        stack.addLast(x)
    }

    //variable to store reversed string
    var reversedString =""
    while (stack.isNotEmpty()){
        reversedString+=stack.removeLast()
    }
    return  reversedString
}
